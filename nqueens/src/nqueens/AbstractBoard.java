package nqueens;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;






public abstract class AbstractBoard implements Board {
	private int boardSize;
	private int boardBlocked;
	private final BoardSegment[]rows,cols;
	private Set<Cell> emptyCells;
	private List<Cell> queensPositions;
	private Set<BoardChangeListener>changeListeners;
	private Set<SolverObserver>observers;
	public AbstractBoard(int boardSize) {
		super();
		this.observers=new HashSet<SolverObserver>();
		this.changeListeners=new HashSet<BoardChangeListener>();
		this.rows=new BoardSegment[boardSize];
		this.cols=new BoardSegment[boardSize];
		this.boardSize = boardSize;
		this.boardBlocked=0;
		this.queensPositions = new LinkedList<Cell>();
		this.emptyCells = new HashSet<Cell>(boardSize*boardSize);
		final CellChangeListener ccl = new CellChangeAdapter() {
			@Override
			public void changed(Cell cell, boolean isOccupied, int blockLevel) {
				if(isOccupied || blockLevel>0){
					emptyCells.remove(cell);
				}else{
					emptyCells.add(cell);
				}
			}
			@Override
			public void undo(Cell cell) {
				queensPositions.remove(cell);
				notifyListiners();
				for(SolverObserver so:observers){so.incrementUndos();}
			}
			@Override
			public void queenPlaced(Cell cell) {
				queensPositions.add(0,cell);
				notifyListiners();
				for(SolverObserver so:observers){so.incrementAttempts();}
			}
		};
		final BlockingListener bl = new BlockingListener() {
			
			@Override
			public void unblocked() {
				if(--boardBlocked==0){
					notifyListenersUnblocked();
				}
			}
			
			@Override
			public void blocked() {
				boardBlocked++;
				notifyListenersBlocked();
			}
		};
		for(int i=0;i<boardSize;++i){
			this.rows[i]=new DefaultBoardSegment(boardSize,bl);
			this.cols[i]=new DefaultBoardSegment(boardSize,bl);
		}
		for(int i=0;i<boardSize;++i){
			for(int j=0;j<boardSize;++j){
				final Cell cell = new DefaultCell(this,ccl,i,j);
				this.rows[i].add(cell);
				this.cols[j].add(cell);
				this.emptyCells.add(cell);
			}
		}
	}
	@Override
	public boolean isBlocked() {
		return boardBlocked>0;
	}
	protected void notifyListenersUnblocked() {
		for(BoardChangeListener cl:this.changeListeners){cl.unblocked();}
	}
	protected void notifyListenersBlocked() {
		for(BoardChangeListener cl:this.changeListeners){cl.blocked();}
	}
	@Override
	public Cell getCell(int row,int col){
		if(row<0 || row>=this.getBoardSize() || col<0 || col>=this.getBoardSize()){
			return null;
		}
		return this.rows[row].getCell(col);
	}
	@Override
	public void addSolverObserver(SolverObserver solverObserver) {
		this.observers.add(solverObserver);
	}
	@Override
	public int getBoardSize() {
		return boardSize;
	}
	@Override
	public boolean isComplete() {
		return emptyCells.isEmpty();
	}
	@Override
	public boolean isSolved() {
		return this.queensPositions.size()==this.boardSize;
	}
	@Override
	public Cell[] getEmptyCells() {
		
		return emptyCells.toArray(new Cell[emptyCells.size()]);
	}
	@Override
	public void addChangeListener(BoardChangeListener changeListener) {
		this.changeListeners.add(changeListener);
	}
	@Override
	public void notifyListiners() {
		for(BoardChangeListener cl:this.changeListeners){cl.onChanged();}
	}
	
	@Override
	public Object get(BoardAttributes puzzleInfo) {
		switch(puzzleInfo){
		case BoardSize: 	return getBoardSize();
		case EmptyCells: 	return emptyCells.size();
		case IsComplete: 	return isComplete();
		case IsBlocked: 	return isBlocked();
		case IsSolved: 		return isSolved();
		case PlacedQueens: 	return queensPositions.size();
		default: 			return null;
		}
	}
	@Override
	public Cell[] getQueensPositions() {
		return this.queensPositions.toArray(new Cell[this.queensPositions.size()]);
	}
	@Override
	public BoardSegment getCol(int col) {
		return cols[col];
	}
	@Override
	public BoardSegment getRow(int row) {
		return rows[row];
	}
	@Override
	public final void reset() {
		this.queensPositions.clear();
		this.emptyCells.clear();
		for(BoardSegment row:rows){
			for(int i=0;i<boardSize;i++){
				Cell cell = row.getCell(i);
				cell.reset();
				emptyCells.add(cell);
			}
		}
		this.boardBlocked=0;
	}
}
