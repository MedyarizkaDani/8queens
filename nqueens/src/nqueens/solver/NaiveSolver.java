package nqueens.solver;

import java.util.Stack;

import nqueens.Board;
import nqueens.Cell;

public class NaiveSolver extends AbstractSolver {

/** the idea of track is to place the queens 
 * in any empty cell and further down, if the board is blocked,
 * cancel the cells marked and return false, or true otherwise
 */ 
boolean solveBoard(int row){
	final Board b = getBoard();
	if(row>=b.getBoardSize()) return b.isSolved();
	// test the empty cells if placing the queen will not make the board blocked
	final Cell[]emptyCells = b.getRow(row).getEmptyCells();
	for(final Cell cell:emptyCells){
		cell.flipOccupied();
		if(b.isBlocked()){
			// the board is blocked, backtrack
			cell.flipOccupied();
			return false;
		}
		if( solveBoard(cell.getRow()+1) ) {
			// if the next row has not blocked the board, carry on
			return true;
		}else{
			// otherwise, cancel this track and try the next
			cell.flipOccupied();
		}
	}
	return b.isSolved();
}

@Override
public void solveBoard() {
	//solve for row zero
	solveBoard(0);
}
	public void sleep(){
		if(delay()<1)return;
		try {
			Thread.sleep(delay());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int delay() {
		return 1000;
	}
}
