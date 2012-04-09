package nqueens;

public interface Board {

	public abstract Cell getCell(int row, int col);

	public abstract int getBoardSize();

	public abstract boolean isComplete();
	
	public abstract boolean isSolved();

	public abstract int getEmptyCells();

	public abstract int getPlacedQueens();

	public abstract int getUndos();

	public abstract int getAttempts();
	
	public abstract void addChangeListener(BoardChangeListener changeListener);
	public abstract void notifyListiners();

	public abstract Object get(PuzzleInfo puzzleInfo);

	boolean isRowBlocked(int row);
	boolean isColBlocked(int col);
	
	int getRowUnblockedCount(int row);
	int getColUnblockedCount(int col);
}