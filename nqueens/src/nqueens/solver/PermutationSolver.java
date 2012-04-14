package nqueens.solver;

import nqueens.Board;

public class PermutationSolver extends AbstractSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		int N = board.getBoardSize();
		int[]q = solution(N);
		for(int i=0;i<N;i++){
			board.getCell(i, q[i]).flipOccupied();	// place the queen
		}
	}
	// checks if the board configurations and queens placed are not attacking each others
	static boolean safe(int[] q) {
		int n = q.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (Math.abs(q[j] - q[i]) == j-i) return false; 	// same diagonal
			}
		}
		return true;
	}
	static int[]solution(int q){
		int[]a=new int[q];
		for(int i=0;i<a.length;a[i]=i++){}
		for(final Permute permute=new Permute(a);permute.hasNext();){
			a=permute.next();
			if(safe(a)) break;
		}
		return a;
	}

}
