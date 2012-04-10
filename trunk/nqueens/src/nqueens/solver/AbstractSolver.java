package nqueens.solver;

import nqueens.Board;
import nqueens.Coordinate;
import nqueens.SolverObserver;

public abstract class AbstractSolver implements Solver {
	private long time;
	private int undos,attempts;
	private Board board;
	private int[] solution;
	@Override
	public Object get(SolverAttributes solverAttribute) {
		switch (solverAttribute) {
		case Attempts:		return getAttempts();
		case Undos:			return getUndos();
		case TimeElapsed:	return getTimeElapsed();
		default: 			return null;
		}
	}
	@Override
	public Board getBoard() {
		return board;
	}
	@Override
	public void setBoard(Board board) {
		this.board=board;
		board.addSolverObserver(new SolverObserver() {
			@Override
			public void incrementUndos() {
				undos++;
			}
			@Override
			public void incrementAttempts() {
				attempts++;
			}
		});
	}

	@Override
	public int getUndos() {
		return undos;
	}

	@Override
	public int getAttempts() {
		return attempts;
	}
	@Override
	public void startTimer() {
		this.time=System.currentTimeMillis();
	}
	@Override
	public void stopTimer() {
		this.time=System.currentTimeMillis()-time;
	}
	@Override
	public long getTimeElapsed() {
		return time;
	}
	@Override
	public final void solve() {
		startTimer();
		final Board board = getBoard();
		if(board.isComplete() || board.isSolved() || board.isBlocked()){
			board.reset();
		}
		solveBoard();
		solution = new int[board.getBoardSize()];
		final Coordinate[]coordinates=board.getQueensPositions();
		for(Coordinate c:coordinates){solution[c.getRow()]=c.getCol();}
		//System.out.println(Arrays.toString(getSolution()));
		stopTimer();
	}
	protected abstract void solveBoard();
	@Override
	public int speed() {
		return 0;
	}
	
	@Override
	public int[] getSolution() {
		return solution;
	}
	@Override
	public void reset() {
		this.time=0;
		this.solution=null;
		this.attempts=0;
		this.undos=0;
	}
}
