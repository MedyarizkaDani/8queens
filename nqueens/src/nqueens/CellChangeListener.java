package nqueens;

public interface CellChangeListener {
	public abstract void changed(Cell cell,boolean isOccupied,int blockLevel);
	//public abstract void occupied();
	//public abstract void emptied();
	public abstract void undo(Cell cell);
	public abstract void queenPlaced(Cell cell);
	void blocked(Cell cell);
	void unblocked(Cell cell);
}
