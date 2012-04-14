package nqueens.solver;

import nqueens.Board;

public class RecursiveNQueensSolver extends AbstractNQueensSolver {
	   /***********************************************************************
	    * Return true if queen placement q[n] does not conflict with
	    * other queens q[0] through q[n-1]
	    ***********************************************************************/
		public  boolean isConsistent(int[] q, int n) {
		    for (int i = 0; i < n; i++) {
		        if (q[i] == q[n])             return false;   // same column
		        if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
		        if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
		    }
		    return true;
		}

//	   /***********************************************************************
//	    * Print out N-by-N placement of queens from permutation q in ASCII.
//	    ***********************************************************************/
//	    public void printQueens(int[] q) {
//	        int N = q.length;
//	        for (int i = 0; i < N; i++) {
//	            for (int j = 0; j < N; j++) {
//	                if (q[i] == j) System.out.print("Q ");
//	                else           System.out.print("* ");
//	            }
//	            System.out.println();
//	        }  
//	        System.out.println();
//	    }


/***********************************************************************
*  Try all permutations using backtracking
***********************************************************************/
public  void enumerate(int N) {
    int[] a = new int[N];
    stop=false;
    enumerate(a, 0);
}
boolean stop;
public void enumerate(int[] q, int n) {
	if(stop)return;
    final int N = q.length;
    if (n == N) {
    	
    	final Board board = getBoard();
    	
    	for(int i=0;i<N;i++){
    		board.getCell(i, q[i]).flipOccupied();
    	}
    	stop=true;
    } else {
        for (int i = 0; i < N; i++) {
            q[n] = i;
            if (isConsistent(q, n)) enumerate(q, n+1);
        }
    }
}  
	@Override
	protected void solveBoard() {
		enumerate(getBoard().getBoardSize());
	}

}
