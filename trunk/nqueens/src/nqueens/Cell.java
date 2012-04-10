package nqueens;

public interface Cell extends Coordinate{
	boolean isOccupied();
	void flipOccupied();
	void cascadeBlockLevel(Direction direction, int blockLevel);
	void addCellChangeListener(CellChangeListener cellChangeListener);
	int getBlockLevel();
	CellType getCellType();
	Cell getNeighbor(Direction direction);
	void reset();
}