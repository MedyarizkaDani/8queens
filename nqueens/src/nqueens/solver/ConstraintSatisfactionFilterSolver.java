package nqueens.solver;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.Solution;
import nqueens.Board;

public class ConstraintSatisfactionFilterSolver extends AbstractSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		final int n= board.getBoardSize();
		final Network net = new Network();
		final IntVariable[] q = new IntVariable[n];
		final IntVariable[] u = new IntVariable[n];
		final IntVariable[] d = new IntVariable[n];
		for (int i = 0; i < n; ++i) {
			q[i] = new IntVariable(net, 0, n-1);
			u[i] = q[i].add(i);
			d[i] = q[i].subtract(i);
		}
		new NotEquals(net, q);
		new NotEquals(net, u);
		new NotEquals(net, d);
		final Solution solution = new DefaultSolver(net).findFirst();
		for(int r=0;r<q.length;r++){
			int c = solution.getIntValue(q[r]);
			board.getCell(r,c).flipOccupied();
		}
	}

}
