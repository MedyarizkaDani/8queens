package nqueens.solver;

import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RecursiveSolverJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public void nqueens.solver.AbstractSolver.stopTimer()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testStopTimer() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.stopTimer();
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "4";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = null;
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.solver.AbstractSolver.startTimer()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testStartTimer() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.startTimer();
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "1334230594714";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = null;
		assertEquals(expectedv,actualv);

	}
	/** test case for [public int nqueens.solver.AbstractSolver.speed()] **/
	@Test(timeout=1000)
	public void testSpeed() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		int expected = obj.speed();
		int actual = (int)0;
		assertEquals(expected,actual);

	}
	/** test case for [public final void nqueens.solver.AbstractSolver.solve()] **/
	@Test(expected=java.lang.reflect.InvocationTargetException.class,timeout=1000)
	public void testSolve() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.solve();
		/*
		 * Exception thrown while generating test case : null
		 * EXCEPTION : java.lang.reflect.InvocationTargetException
		 */
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "1334230594737";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = null;
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.solver.AbstractSolver.setBoard(nqueens.Board)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testSetBoard() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.setBoard(new nqueens.Board(){
			public boolean isBlocked(){
				return true;
			}
			public boolean isComplete(){
				return true;
			}
			public boolean isSolved(){
				return true;
			}
			public int getBoardSize(){
				return 1;
			}
			public java.lang.Object get(nqueens.BoardAttributes p1BoardAttributes){
				return new Object();
			}
			public nqueens.BoardSegment getCol(int p1int){
				return (nqueens.BoardSegment)null;
			}
			public nqueens.BoardSegment getRow(int p1int){
				return (nqueens.BoardSegment)null;
			}
			public nqueens.Cell getCell(int p1int,int p2int){
				return (nqueens.Cell)null;
			}
			public nqueens.Cell[] getEmptyCells(){
				return (nqueens.Cell[])null;
			}
			public nqueens.Cell[] getQueensPositions(){
				return (nqueens.Cell[])null;
			}
			public void addChangeListener(nqueens.BoardChangeListener p1BoardChangeListener){
				return ;
			}
			public void addSolverObserver(nqueens.SolverObserver p1SolverObserver){
				return ;
			}
			public void notifyListiners(){
				return ;
			}
			public void reset(){
				return ;
			}

	});
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "1334230594737";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = "nqueens.BoardJProbe$1@7a0136b0";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.solver.AbstractSolver.reset()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testReset() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.reset();
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = null;
		assertEquals(expectedv,actualv);

	}
	/** test case for [public boolean nqueens.solver.RecursiveSolver.isConsistent(int[],int)] **/
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class,timeout=1000)
	public void testIsConsistent() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		boolean expected = obj.isConsistent(new int[]{1},1);
		assertNotNull(expected);

	}
	/** test case for [public int nqueens.solver.AbstractSolver.getUndos()] **/
	@Test(timeout=1000)
	public void testGetUndos() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		int expected = obj.getUndos();
		int actual = (int)0;
		assertEquals(expected,actual);

	}
	/** test case for [public long nqueens.solver.AbstractSolver.getTimeElapsed()] **/
	@Test(timeout=1000)
	public void testGetTimeElapsed() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		long expected = obj.getTimeElapsed();
		long actual = 0L;
		assertEquals(expected,actual);

	}
	/** test case for [public int[] nqueens.solver.AbstractSolver.getSolution()] **/
	@Test(timeout=1000)
	public void testGetSolution() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		int[] expected = obj.getSolution();
		assertNotNull(expected);

	}
	/** test case for [public nqueens.Board nqueens.solver.AbstractSolver.getBoard()] **/
	@Test(timeout=1000)
	public void testGetBoard() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		nqueens.Board expected = obj.getBoard();
		assertNotNull(expected);

	}
	/** test case for [public int nqueens.solver.AbstractSolver.getAttempts()] **/
	@Test(timeout=1000)
	public void testGetAttempts() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		int expected = obj.getAttempts();
		int actual = (int)0;
		assertEquals(expected,actual);

	}
	/** test case for [public java.lang.Object nqueens.solver.AbstractSolver.get(nqueens.solver.SolverAttributes)] **/
	@Test(expected=java.lang.NullPointerException.class,timeout=1000)
	public void testGet() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		java.lang.Object expected = obj.get((nqueens.solver.SolverAttributes)null);
		assertNotNull(expected);

	}
	/** test case for [public void nqueens.solver.RecursiveSolver.enumerate(int)] **/
	@Test(expected=java.lang.reflect.InvocationTargetException.class,timeout=1000)
	public void testEnumerate() throws Throwable{
		nqueens.solver.RecursiveSolver obj = new nqueens.solver.RecursiveSolver();
		/*void*/ obj.enumerate(1);
		/*
		 * Exception thrown while generating test case : null
		 * EXCEPTION : java.lang.reflect.InvocationTargetException
		 */
		String actualv,expectedv;
		expectedv = ""+obj.isConsistent(new int[]{1},1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getAttempts();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUndos();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.speed();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getSolution();
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.solver.SolverAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getTimeElapsed();
		actualv = "4";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoard();
		actualv = null;
		assertEquals(expectedv,actualv);

	}
}