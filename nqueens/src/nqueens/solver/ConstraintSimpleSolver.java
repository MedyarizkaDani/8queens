package nqueens.solver;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.Solution;
import nqueens.Board;

public class ConstraintSimpleSolver extends AbstractSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		final int n= board.getBoardSize();
		final Network net = new Network();
		final IntVariable[] q = new IntVariable[n];
		for (int i = 0; i < n; ++i) {
			q[i] = new IntVariable(net, 1, n);
		}
		new NotEquals(net, q);
		// Notice that j index starts from i+1
		for (int i = 0; i < q.length; i++){
			for (int j = i + 1; j < q.length; j++) {

				// Temporary variable denotes the chessboard
				// field in j-th column which is checked by
				// i-th column queen
				// If temporarty variable has value outside
				// range 1..n then i-th column queen
				// does not check any field in j-th column

				// Checking diagonals like this \
				IntVariable temporary1 = new IntVariable(net, -2 * n, 2 * n);
				q[j].add(j-i).equals(temporary1);
				q[i].notEquals(temporary1);

				// Checking diagonals like this /
				IntVariable temporary2 = new IntVariable(net, -2 * n, 2 * n);
				q[j].subtract(j-i).equals(temporary2);
				q[i].notEquals(temporary2);
			}

		}


		final Solution solution = new DefaultSolver(net).findFirst();
		for(int r=0;r<q.length;r++){
			int c = solution.getIntValue(q[r])-1;
			System.out.println(c);
			board.getCell(r,c).flipOccupied();
		}

	}

}
