package nqueens.solver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import nqueens.Board;
import nqueens.Cell;

public class NaiveSolver extends AbstractSolver {

	@Override
	public void solveBoard() {
		final Board b = getBoard();
		//int[] queens = new int[b.getBoardSize()];
		int row=0;
		int rowBefore;
		
		final Stack<Cell>tested=new Stack<Cell>();
		final List<Integer>acc=new ArrayList<Integer>();
		final Map<String,List<Cell>>alltested=new HashMap<String,List<Cell>>();
		String tc="";
		while(!b.isSolved()){
			final Cell[] cells = b.getRow(row).getEmptyCells();
			rowBefore=row;
			for(final Cell cell:cells){
				tc=Arrays.toString(acc.toArray());
				if(!alltested.containsKey(tc)){
					alltested.put(tc, new ArrayList<Cell>());
					
				}
				//System.out.println(tc);
				if(alltested.get(tc).contains(cell)){continue;}
				cell.flipOccupied();
				//stack.push(cell.getCol());
				if(!b.isBlocked()){
					alltested.get(tc).add(cell);
					tested.push(cell);
					acc.add(cell.getCol());
					row++;
					//System.out.println("-"+row);
					break;
				}
				sleep();
				cell.flipOccupied();
			}
			if(rowBefore==row){
				--row;
				Cell cell=tested.pop();
				cell.flipOccupied();
				acc.remove(new Integer(cell.getCol()));
			}
			sleep();
			if(row>=b.getBoardSize())break;
		}
	}
	public void sleep(){
		if(speed()<1)return;
		try {
			Thread.sleep(speed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
