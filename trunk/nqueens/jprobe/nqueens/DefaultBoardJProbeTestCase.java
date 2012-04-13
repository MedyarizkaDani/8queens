package nqueens;

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

public class DefaultBoardJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public final void nqueens.AbstractBoard.reset()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testReset() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		/*void*/ obj.reset();
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isComplete();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isSolved();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoardSize();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.BoardAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1,1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[0/0]";
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getQueensPositions());
		actualv = "[]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.AbstractBoard.notifyListiners()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testNotifyListiners() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		/*void*/ obj.notifyListiners();
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isComplete();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isSolved();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoardSize();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.BoardAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1,1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[0/0]";
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getQueensPositions());
		actualv = "[]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public boolean nqueens.AbstractBoard.isSolved()] **/
	@Test(timeout=1000)
	public void testIsSolved() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		boolean expected = obj.isSolved();
		boolean actual = (boolean)false;
		assertEquals(expected,actual);

	}
	/** test case for [public boolean nqueens.AbstractBoard.isComplete()] **/
	@Test(timeout=1000)
	public void testIsComplete() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		boolean expected = obj.isComplete();
		boolean actual = (boolean)false;
		assertEquals(expected,actual);

	}
	/** test case for [public boolean nqueens.AbstractBoard.isBlocked()] **/
	@Test(timeout=1000)
	public void testIsBlocked() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		boolean expected = obj.isBlocked();
		boolean actual = (boolean)false;
		assertEquals(expected,actual);

	}
	/** test case for [public nqueens.BoardSegment nqueens.AbstractBoard.getRow(int)] **/
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class,timeout=1000)
	public void testGetRow() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		nqueens.BoardSegment expected = obj.getRow(1);
		assertNotNull(expected);

	}
	/** test case for [public nqueens.Cell[] nqueens.AbstractBoard.getQueensPositions()] **/
	@Test(timeout=1000)
	public void testGetQueensPositions() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		nqueens.Cell[] expected = obj.getQueensPositions();
		String actual = "[]";
		assertEquals(Arrays.toString((nqueens.Cell[])expected),actual);

	}
	/** test case for [public nqueens.Cell[] nqueens.AbstractBoard.getEmptyCells()] **/
	@Test(timeout=1000)
	public void testGetEmptyCells() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		nqueens.Cell[] expected = obj.getEmptyCells();
		String actual = "[0/0]";
		assertEquals(Arrays.toString((nqueens.Cell[])expected),actual);

	}
	/** test case for [public nqueens.BoardSegment nqueens.AbstractBoard.getCol(int)] **/
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class,timeout=1000)
	public void testGetCol() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		nqueens.BoardSegment expected = obj.getCol(1);
		assertNotNull(expected);

	}
	/** test case for [public nqueens.Cell nqueens.AbstractBoard.getCell(int,int)] **/
	@Test(timeout=1000)
	public void testGetCell() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		nqueens.Cell expected = obj.getCell(1,1);
		assertNotNull(expected);

	}
	/** test case for [public int nqueens.AbstractBoard.getBoardSize()] **/
	@Test(timeout=1000)
	public void testGetBoardSize() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		int expected = obj.getBoardSize();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
	/** test case for [public java.lang.Object nqueens.AbstractBoard.get(nqueens.BoardAttributes)] **/
	@Test(expected=java.lang.NullPointerException.class,timeout=1000)
	public void testGet() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		java.lang.Object expected = obj.get((nqueens.BoardAttributes)null);
		assertNotNull(expected);

	}
	/** test case for [public void nqueens.AbstractBoard.addSolverObserver(nqueens.SolverObserver)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testAddSolverObserver() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		/*void*/ obj.addSolverObserver(new nqueens.SolverObserver(){
			public void incrementAttempts(){
				return ;
			}
			public void incrementUndos(){
				return ;
			}

	});
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isComplete();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isSolved();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoardSize();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.BoardAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1,1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[0/0]";
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getQueensPositions());
		actualv = "[]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.AbstractBoard.addChangeListener(nqueens.BoardChangeListener)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testAddChangeListener() throws Throwable{
		nqueens.DefaultBoard obj = new nqueens.DefaultBoard(1);
		/*void*/ obj.addChangeListener(new nqueens.BoardChangeListener(){
			public void blocked(){
				return ;
			}
			public void onChanged(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isComplete();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.isSolved();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBoardSize();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.get((nqueens.BoardAttributes)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1,1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[0/0]";
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getQueensPositions());
		actualv = "[]";
		assertEquals(expectedv,actualv);

	}
}