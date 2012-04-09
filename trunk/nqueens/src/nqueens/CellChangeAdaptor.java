package nqueens;

public abstract class CellChangeAdaptor implements CellChangeListener {
	@Override public void changed(Cell cell, boolean isOccupied, int blockLevel) {}
	@Override public void undo(Cell cell) {}
	@Override public void queenPlaced(Cell cell) {}
	@Override public void blocked(Cell cell) {}
	@Override public void unblocked(Cell cell) {}
	
}
