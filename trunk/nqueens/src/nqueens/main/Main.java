package nqueens.main;

import java.util.Arrays;

import nqueens.Board;
import nqueens.DefaultBoard;
import nqueens.solver.ConstraintLookaheadSolver;
import nqueens.solver.Solver;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new DefaultBoard(100);
		Solver solver = new ConstraintLookaheadSolver();
		solver.setBoard(board);
		solver.solve();
		System.out.println(Arrays.toString(solver.getSolution()));
		System.out.println(solver.getTimeElapsed());
	}

}
