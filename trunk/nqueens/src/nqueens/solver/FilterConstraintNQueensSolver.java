package nqueens.solver;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.Solution;
import nqueens.Board;

public class FilterConstraintNQueensSolver extends AbstractNQueensSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		final int n= board.getBoardSize();
final Network net = new Network();
final IntVariable[] q = new IntVariable[n];	// row constraints
final IntVariable[] u = new IntVariable[n];	// column constraints
final IntVariable[] d = new IntVariable[n]; // diagonal constraint
for (int i = 0; i < n; ++i) {
	q[i] = new IntVariable(net, 0, n-1);
	u[i] = q[i].add(i);
	d[i] = q[i].subtract(i);
}
new NotEquals(net, q);	// distinct values in rows 
new NotEquals(net, u);  // distinct values in columns
new NotEquals(net, d);  // distinct values in diagonals
		
		final Solution solution = new DefaultSolver(net).findFirst();
		for(int r=0;r<q.length;r++){
			int c = solution.getIntValue(q[r]);
			board.getCell(r,c).flipOccupied();
		}
	}

}
