package nqueens;

import java.util.Arrays;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.Solution;

public class NQueens {
	private final int size;
	public  NQueens(int n){
		size=n;
	}
	
	int[] solve(){
		int[]queens = new int[size];
		Network n = new Network();
		IntVariable[] ivs = new IntVariable[size];
		
		for(int i=0;i<queens.length;++i){
			ivs[i]=new IntVariable(n);
			ivs[i].ge(0);
			ivs[i].lt(size);
		}
		/*
		 
		
		  
		 */
		
		
		for(int i=0;i<queens.length;++i){
			
			 for(int x=1;x<size;x=x+1){
					// checking not on same row is not necessary, but another constraint 
					// can be useful which is, if a queen is placed in row 1, then
					// do not bother with placing the next queen one step above it, because 
					// they can attack each other, or one step below it.
					if(i+x<size){
						ivs[i].add(x).notEquals(ivs[i+x]);
						ivs[i].add(-x).notEquals(ivs[i+x]);
						ivs[i+x].add(x).notEquals(ivs[i]);
						ivs[i+x].add(-x).notEquals(ivs[i]);
					}
				}
			
			for(int j=i+1;j<queens.length;++j){
				// not on the same column
				ivs[i].notEquals(ivs[j]);
				// not on the same diagonal
				//ivs[i].add(ivs[j].negate()).notEquals(j-i);
				//ivs[j].add(ivs[i].negate()).notEquals(j-i);
			}
		}
		
		
		
		
		Solution s = new DefaultSolver(n).findFirst();
		
		for(int i=0;i<queens.length;++i){
			queens[i]=s.getIntValue(ivs[i]);
		}
		return queens;
	}
	void print(){
		long t = System.currentTimeMillis();
		int[]s=solve();
		t = System.currentTimeMillis()-t;
		System.out.println("time : "+t+"ms");
		System.out.println(Arrays.toString(s));
		char[] l = new char[size];
		Arrays.fill(l, '*');
		for(int i:s){
			l[i]='Q';
			System.out.println(new String(l));
			l[i]='*';
		}
	}
	public static void main(String[]a){
		final int n = 33;
		System.out.printf("Solving %dx%d problem - ",n,n);
		new NQueens(n).print();
	}
}
