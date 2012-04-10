package nqueens;

public interface SolverObserver {
	void incrementAttempts();
	void incrementUndos();
}
