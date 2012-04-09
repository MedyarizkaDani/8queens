package nqueens;

import java.util.HashSet;
import java.util.Set;





public abstract class AbstractBoard implements Board {
	private int boardSize;
	
	private final BoardSegment[]rows,cols;
	private Set<Cell> emptyCells;
	private Set<BoardChangeListener>changeListeners;
	private int placedQueens = 0,attempts=0;
	private int undos=0;
	public AbstractBoard(int boardSize) {
		super();
		this.changeListeners=new HashSet<BoardChangeListener>();
		this.rows=new BoardSegment[boardSize];
		this.cols=new BoardSegment[boardSize];
		this.boardSize = boardSize;
		this.emptyCells = new HashSet<Cell>(boardSize*boardSize);
		final CellChangeListener ccl = new CellChangeAdaptor() {
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
				undos++;
				placedQueens--;
				notifyListiners();
			}
			@Override
			public void queenPlaced(Cell cell) {
				placedQueens++;
				attempts++;
				notifyListiners();
			}
		};
		final BlockingListener bl = new BlockingListener() {
			
			@Override
			public void unblocked() {
				notifyListenersUnblocked();
			}
			
			@Override
			public void blocked() {
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
				//this.chessBoard[i][j]=cell;
				this.rows[i].add(cell);
				this.cols[j].add(cell);
				this.emptyCells.add(cell);
			}
		}
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
	public int getBoardSize() {
		return boardSize;
	}
	@Override
	public boolean isComplete() {
		return emptyCells.isEmpty();
	}
	@Override
	public boolean isSolved() {
		return this.placedQueens==this.boardSize;
	}
	@Override
	public int getEmptyCells() {
		return emptyCells.size();
	}
	@Override
	public int getPlacedQueens() {
		return this.placedQueens;
	}
	@Override
	public int getUndos() {
		return undos;
	}
	@Override
	public int getAttempts() {
		return attempts;
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
	public Object get(PuzzleInfo puzzleInfo) {
		switch(puzzleInfo){
		case Attempts: 		return getAttempts();
		case BoardSize: 	return getBoardSize();
		case EmptyCells: 	return getEmptyCells();
		case IsComplete: 	return isComplete();
		case IsSolved: 		return isSolved();
		case PlacedQueens: 	return getPlacedQueens();
		case Undos: 		return getUndos();
		default: 			return null;
		}
	}
	@Override
	public boolean isRowBlocked(int row){return rows[row].isBlocked();}
	@Override
	public boolean isColBlocked(int col){return cols[col].isBlocked();}
	@Override
	public int getColUnblockedCount(int col) {
		return this.cols[col].getUnblockedCount();
	}
	@Override
	public int getRowUnblockedCount(int row) {
		return this.rows[row].getUnblockedCount();
	}
}
