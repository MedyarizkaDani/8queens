package nqueens;

public interface Cell {

	public abstract boolean isOccupied();

	public abstract void flipOccupied();

	public abstract void cascadeBlockLevel(Direction direction, int blockLevel);

	public abstract void addCellChangeListener(
			CellChangeListener cellChangeListener);

	public abstract int getBlockLevel();

	public abstract int getRow();

	public abstract int getCol();

	public abstract CellType getCellType();

	public abstract Cell getNeighbor(Direction direction);

}