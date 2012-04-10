package nqueens.main;

import java.util.Arrays;

import nqueens.Board;
import nqueens.DefaultBoard;
import nqueens.solver.NaiveSolver;
import nqueens.solver.Solver;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new DefaultBoard(27);
		Solver solver = new NaiveSolver();
		solver.setBoard(board);
		solver.solve();
		System.out.println(Arrays.toString(solver.getSolution()));
		System.out.println(solver.getTimeElapsed());
	}

}
