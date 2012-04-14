import java.util.Arrays;

import nqueens.Board;
import nqueens.DefaultBoard;
import nqueens.solver.NQueensSolver;
import nqueens.solver.NaiveNQueensSolver;

import org.junit.Test;


public class NQueensTest {
	@Test
	public void testPermutation() throws Throwable{
		
//		final NQueensSolver ps = NQueensSolverType.Naive.solver().newInstance();
//		
//		for (int i=4;i<=100;i++){
//			Board board = new DefaultBoard(i);
//			ps.setBoard(board);
//			ps.solve();
//			if(board.isSolved()){
//				System.out.println( i+";"+ps.getTimeElapsed());
//			}
//			ps.reset();
//		}
		Board board = new DefaultBoard(27);
		NQueensSolver solver = new NaiveNQueensSolver();
		solver.setBoard(board);
		solver.solve();
		System.out.println(Arrays.toString(solver.getSolution()));
		System.out.println(solver.getTimeElapsed());
	}
}
