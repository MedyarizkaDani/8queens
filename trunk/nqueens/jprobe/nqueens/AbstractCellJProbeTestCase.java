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

public class AbstractCellJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public java.lang.String nqueens.AbstractCoordinate.toString()] **/
	@Test(timeout=1000)
	public void testToString() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		java.lang.String expected = obj.toString();
		java.lang.String actual = "1/1";
		assertEquals(expected,actual);

	}
	/** test case for [public void nqueens.AbstractCell.reset()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testReset() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		/*void*/ obj.reset();
		String actualv,expectedv;
		expectedv = ""+obj.isOccupied();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBlockLevel();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "1/1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getNeighbor((nqueens.Direction)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCellType();
		actualv = "Dark";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public boolean nqueens.AbstractCell.isOccupied()] **/
	@Test(timeout=1000)
	public void testIsOccupied() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		boolean expected = obj.isOccupied();
		boolean actual = (boolean)false;
		assertEquals(expected,actual);

	}
	/** test case for [public int nqueens.AbstractCoordinate.getRow()] **/
	@Test(timeout=1000)
	public void testGetRow() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		int expected = obj.getRow();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
	/** test case for [public nqueens.Cell nqueens.AbstractCell.getNeighbor(nqueens.Direction)] **/
	@Test(expected=java.lang.NullPointerException.class,timeout=1000)
	public void testGetNeighbor() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		nqueens.Cell expected = obj.getNeighbor((nqueens.Direction)null);
		assertNotNull(expected);

	}
	/** test case for [public int nqueens.AbstractCoordinate.getCol()] **/
	@Test(timeout=1000)
	public void testGetCol() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		int expected = obj.getCol();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
	/** test case for [public nqueens.CellType nqueens.AbstractCell.getCellType()] **/
	@Test(timeout=1000)
	public void testGetCellType() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		nqueens.CellType expected = obj.getCellType();
		String actual = "Dark";
		assertEquals(expected.toString(),actual);

	}
	/** test case for [public int nqueens.AbstractCell.getBlockLevel()] **/
	@Test(timeout=1000)
	public void testGetBlockLevel() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		int expected = obj.getBlockLevel();
		int actual = (int)0;
		assertEquals(expected,actual);

	}
	/** test case for [public void nqueens.AbstractCell.flipOccupied()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testFlipOccupied() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		/*void*/ obj.flipOccupied();
		String actualv,expectedv;
		expectedv = ""+obj.isOccupied();
		actualv = "true";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBlockLevel();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "1/1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getNeighbor((nqueens.Direction)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCellType();
		actualv = "Dark";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.AbstractCell.cascadeBlockLevel(nqueens.Direction,int)] **/
	@Test(expected=java.lang.reflect.InvocationTargetException.class,timeout=1000)
	public void testCascadeBlockLevel() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		/*void*/ obj.cascadeBlockLevel((nqueens.Direction)null,1);
		/*
		 * Exception thrown while generating test case : null
		 * EXCEPTION : java.lang.reflect.InvocationTargetException
		 */
		String actualv,expectedv;
		expectedv = ""+obj.isOccupied();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBlockLevel();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "1/1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getNeighbor((nqueens.Direction)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCellType();
		actualv = "Dark";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.AbstractCell.addCellChangeListener(nqueens.CellChangeListener)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testAddCellChangeListener() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		/*void*/ obj.addCellChangeListener(new nqueens.CellChangeListener(){
			public void blocked(nqueens.Cell p1Cell){
				return ;
			}
			public void changed(nqueens.Cell p1Cell,boolean p2boolean,int p3int){
				return ;
			}
			public void queenPlaced(nqueens.Cell p1Cell){
				return ;
			}
			public void unblocked(nqueens.Cell p1Cell){
				return ;
			}
			public void undo(nqueens.Cell p1Cell){
				return ;
			}

	});
		String actualv,expectedv;
		expectedv = ""+obj.isOccupied();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getBlockLevel();
		actualv = "0";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCol();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getRow();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "1/1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getNeighbor((nqueens.Direction)null);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCellType();
		actualv = "Dark";
		assertEquals(expectedv,actualv);

	}
	/** test case for [static int[] nqueens.AbstractCell.$SWITCH_TABLE$nqueens$Direction()] **/
	@Test(timeout=1000)
	public void test$SWITCH_TABLE$nqueens$Direction() throws Throwable{
		nqueens.AbstractCell obj = new nqueens.AbstractCell(new nqueens.Board(){
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

	},1,1){

	};
		Object expected = null;
		java.lang.reflect.Method method = nqueens.AbstractCell.class.getDeclaredMethod("$SWITCH_TABLE$nqueens$Direction",new Class<?>[]{});
		method.setAccessible(true);
		expected = method.invoke(obj,new Object[]{});
		String actual = "[1, 2, 3, 4, 5, 6, 7, 8]";
		assertEquals(Arrays.toString((int[])expected),actual);

	}
}