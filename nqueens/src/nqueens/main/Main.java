package nqueens.main;

import java.util.Arrays;

import nqueens.Board;
import nqueens.DefaultBoard;
import nqueens.solver.LookaheadConstraintNQueensSolver;
import nqueens.solver.NQueensSolver;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new DefaultBoard(100);
		NQueensSolver solver = new LookaheadConstraintNQueensSolver();
		solver.setBoard(board);
		solver.solve();
		System.out.println(Arrays.toString(solver.getSolution()));
		System.out.println(solver.getTimeElapsed());
	}

}
