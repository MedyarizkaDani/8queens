package nqueens.solver;

import nqueens.Board;

public interface NQueensSolver {
	void solve();
	void reset();
	long getTimeElapsed();
	void setBoard(Board board);
	Board getBoard();
	int getUndos();
	int getAttempts();
	void startTimer();
	void stopTimer();
	Object get(SolverAttributes solverAttribute);
	int delay();
	int[] getSolution();
}
