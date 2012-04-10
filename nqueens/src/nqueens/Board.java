package nqueens;

public interface Board {
	Cell getCell(int row, int col);
	int getBoardSize();
	boolean isComplete();
	boolean isSolved();
	boolean isBlocked();
	void addChangeListener(BoardChangeListener changeListener);
	void notifyListiners();
	Object get(BoardAttributes boardAttribute);
	void reset();
	Cell[]getEmptyCells();
	Cell[]getQueensPositions();
	void addSolverObserver(SolverObserver solverObserver);
	BoardSegment getRow(int row);
	BoardSegment getCol(int col);
}