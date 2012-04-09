package nqueens;

import java.util.HashSet;
import java.util.Set;


public abstract class AbstractCell implements Cell {
	private Set<CellChangeListener> cellChangeListeners;
	private boolean occupied = false;
	private int iBlockLevel = 0;
	
	private Board board;
	private final CellType cellType;
	private final int row,col;

	public AbstractCell(Board board,int row,int col) {
		super();
		this.board=board;
		this.row = row;
		this.col = col;
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
	public int getRow() {
		return row;
	}
	@Override
	public int getCol() {
		return col;
	}
	@Override
	public CellType getCellType() {
		return cellType;
	}
	@Override
	public Cell getNeighbor(Direction direction){
		switch(direction){
		case N : return board.getCell(row-1, col  );
		case S : return board.getCell(row+1, col  );
		case E : return board.getCell(row  , col+1);
		case W : return board.getCell(row  , col-1);
		case NE: return board.getCell(row-1, col+1);
		case NW: return board.getCell(row-1, col-1);
		case SE: return board.getCell(row+1, col+1);
		case SW: return board.getCell(row+1, col-1);
		default: return null;
		}
	}
	@Override
	public String toString() {
		return occupied?"Q":(iBlockLevel>0?"*":"_");
	}
}
