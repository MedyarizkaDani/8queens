package nqueens.solver;

import java.util.Arrays;

import nqueens.Board;

public class BruteForceNQueensSolver extends AbstractNQueensSolver {

	@Override
	protected void solveBoard() {
		final Board board = getBoard();
		int N = board.getBoardSize();
		int[]q = solution(N);
		for(int i=0;i<N;i++){
			board.getCell(i, q[i]).flipOccupied();
		}
	}
	
	// increments an array by 1, as if the array is a single number
	// its digits distributed among array positions
	static void inc(int[]q){
		int i=q.length-1;
		q[i]++;
	
		while(i>0 && q[i]>=q.length){
			q[i--]=0;
			q[i]++;			
		}
	}
	
	static boolean safe(int[] q) {
		int n = q.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (q[j] == q[i]) return false; 
				if (Math.abs(q[j] - q[i]) == j-i) return false; 
			}
		}
		return true;
	}
	static void print(int[]a){
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[]args){
		print(solution(7));
	}
	static int[]solution(int q){
		int a[]=new int[q];
		for(int i=0;i<a.length;a[i]=i++){}
		for(int i=0;i<Math.pow(a.length, a.length);i++){
			if(safe(a)) break;
			inc(a);
		}
		return a;
	}
}
