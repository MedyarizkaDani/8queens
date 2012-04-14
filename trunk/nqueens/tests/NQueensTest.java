import nqueens.Board;
import nqueens.DefaultBoard;
import nqueens.solver.Solver;
import nqueens.solver.SolverType;

import org.junit.Test;


public class NQueensTest {
	@Test
	public void testPermutation() throws Throwable{
		
		final Solver ps = SolverType.Naive.solver().newInstance();
		
		for (int i=4;i<=100;i++){
			Board board = new DefaultBoard(i);
			ps.setBoard(board);
			ps.solve();
			if(board.isSolved()){
				System.out.println( i+";"+ps.getTimeElapsed());
			}
			ps.reset();
		}
	}
}
