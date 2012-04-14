package nqueens.solver;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.Solution;
import nqueens.Board;

public class ConstraintLookaheadSolver extends AbstractSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		final int n= board.getBoardSize();
final Network net = new Network();
final IntVariable[] q = new IntVariable[n];
for (int i = 0; i < n; ++i) {
	q[i] = new IntVariable(net, 0, n-1);
}
for (int i = 0; i < n; ++i) {
	for(int x=1;x<n;x=x+1){
		// checking not on same row is not necessary, but another constraint 
		// can be useful which is, if a queen is placed in row 1, then
		// do not bother with placing the next queen one step above it, because 
		// they can attack each other, or one step below it.
		if(i+x<n){
			q[i].add(x).notEquals(q[i+x]);
			q[i].add(-x).notEquals(q[i+x]);
			q[i+x].add(x).notEquals(q[i]);
			q[i+x].add(-x).notEquals(q[i]);
		}
	}
}
new NotEquals(net, q);

		final Solution solution = new DefaultSolver(net).findFirst();
		for(int r=0;r<q.length;r++){
			int c = solution.getIntValue(q[r]);
			board.getCell(r,c).flipOccupied();
		}
	}

}
