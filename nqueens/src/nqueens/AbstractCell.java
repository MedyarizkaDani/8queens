package nqueens;

import java.util.HashSet;
import java.util.Set;


public abstract class AbstractCell extends AbstractCoordinate implements Cell {
	private Set<CellChangeListener> cellChangeListeners;
	private boolean occupied = false;
	private int iBlockLevel = 0;
	
	private Board board;
	private final CellType cellType;

	public AbstractCell(Board board,int row,int col) {
		super(row,col);
		this.board=board;
		this.cellType = row%2 == col%2 ? CellType.Dark : CellType.Light ;
		this.cellChangeListeners = new HashSet<CellChangeListener>();
	}
	public AbstractCell(Board board,CellChangeListener cellChangeListener,int row,int col) {
		this(board,row,col);
		this.addCellChangeListener(cellChangeListener);
	}
	@Override
	public boolean isOccupied() {
		return occupied;
	}
	@Override
	public void flipOccupied() {
		if(this.getBlockLevel()!=0)return;
		for(Direction direction:Direction.values()){
			final Cell neighbor = getNeighbor(direction);
			if(null!=neighbor){
				neighbor.cascadeBlockLevel(direction, this.isOccupied()?-1:1);
			}
		}
		this.setOccupied(!this.isOccupied());
		notifyListeners(true);
	}
	
	private void setOccupied(boolean b) {
		this.occupied=b;
	}
	private void notifyListeners(boolean src) {
		for(CellChangeListener cellChangeListener:this.cellChangeListeners){
			
			if(src){
				if(isOccupied())cellChangeListener.queenPlaced(this);
				else 
				{
					cellChangeListener.undo(this);
					//cellChangeListener.unblocked(this);
				}
			}
			cellChangeListener.changed(this,occupied,getBlockLevel());
		}
	}
	@Override
	public void cascadeBlockLevel(Direction direction,int blockLevel){
		//this.blockLevel+=blockLevel;
		this.setBlockLevel(this.getBlockLevel()+blockLevel);
		notifyListeners(false);
		final Cell neighbor = getNeighbor(direction);
		if(null!=neighbor){
			neighbor.cascadeBlockLevel(direction, blockLevel);
		}
	}
	private void setBlockLevel(int i) {
		if(this.getBlockLevel()==0 && i>0){
			for(CellChangeListener cellChangeListener:this.cellChangeListeners){
				cellChangeListener.blocked(this);
			}
		}else if(this.getBlockLevel()>0 && i==0){
			for(CellChangeListener cellChangeListener:this.cellChangeListeners){
				cellChangeListener.unblocked(this);
			}
		}
		this.iBlockLevel=i;
	}
	@Override
	public void addCellChangeListener(CellChangeListener cellChangeListener) {
		this.cellChangeListeners.add(cellChangeListener);
	}
	@Override
	public int getBlockLevel() {
		return iBlockLevel;
	}
	

	@Override
	public CellType getCellType() {
		return cellType;
	}
	@Override
	public Cell getNeighbor(Direction direction){
		switch(direction){
		case N : return board.getCell(getRow()-1, getCol()  );
		case S : return board.getCell(getRow()+1, getCol()  );
		case E : return board.getCell(getRow()  , getCol()+1);
		case W : return board.getCell(getRow()  , getCol()-1);
		case NE: return board.getCell(getRow()-1, getCol()+1);
		case NW: return board.getCell(getRow()-1, getCol()-1);
		case SE: return board.getCell(getRow()+1, getCol()+1);
		case SW: return board.getCell(getRow()+1, getCol()-1);
		default: return null;
		}
	}
	@Override
	public void reset() {
		occupied=false;
		iBlockLevel=0;
		notifyListeners(false);
	}
}
