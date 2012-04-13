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

public class DefaultBoardSegmentJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public java.lang.String nqueens.DefaultBoardSegment.toString()] **/
	@Test(timeout=1000)
	public void testToString() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		java.lang.String expected = obj.toString();
		java.lang.String actual = "[null]";
		assertEquals(expected,actual);

	}
	/** test case for [public void nqueens.DefaultBoardSegment.set(int,nqueens.Cell)] **/
	@Test(expected=java.lang.reflect.InvocationTargetException.class,timeout=1000)
	public void testSet() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		/*void*/ obj.set(1,new nqueens.Cell(){
			public boolean isOccupied(){
				return true;
			}
			public int getBlockLevel(){
				return 1;
			}
			public int getCol(){
				return 1;
			}
			public int getRow(){
				return 1;
			}
			public nqueens.Cell getNeighbor(nqueens.Direction p1Direction){
				return (nqueens.Cell)null;
			}
			public nqueens.CellType getCellType(){
				return (nqueens.CellType)null;
			}
			public void addCellChangeListener(nqueens.CellChangeListener p1CellChangeListener){
				return ;
			}
			public void cascadeBlockLevel(nqueens.Direction p1Direction,int p2int){
				return ;
			}
			public void flipOccupied(){
				return ;
			}
			public void reset(){
				return ;
			}

	});
		/*
		 * Exception thrown while generating test case : null
		 * EXCEPTION : java.lang.reflect.InvocationTargetException
		 */
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUnblockedCount();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "[nqueens.CellJProbe$1@72808c3]";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[nqueens.CellJProbe$1@72808c3]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public boolean nqueens.DefaultBoardSegment.isBlocked()] **/
	@Test(timeout=1000)
	public void testIsBlocked() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		boolean expected = obj.isBlocked();
		boolean actual = (boolean)false;
		assertEquals(expected,actual);

	}
	/** test case for [public int nqueens.DefaultBoardSegment.getUnblockedCount()] **/
	@Test(timeout=1000)
	public void testGetUnblockedCount() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		int expected = obj.getUnblockedCount();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
	/** test case for [public nqueens.Cell[] nqueens.DefaultBoardSegment.getEmptyCells()] **/
	@Test(timeout=1000)
	public void testGetEmptyCells() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		nqueens.Cell[] expected = obj.getEmptyCells();
		String actual = "[]";
		assertEquals(Arrays.toString((nqueens.Cell[])expected),actual);

	}
	/** test case for [public nqueens.Cell nqueens.DefaultBoardSegment.getCell(int)] **/
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class,timeout=1000)
	public void testGetCell() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		nqueens.Cell expected = obj.getCell(1);
		assertNotNull(expected);

	}
	/** test case for [public void nqueens.DefaultBoardSegment.addBoardSegmentBlockedListener(nqueens.BlockingListener)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testAddBoardSegmentBlockedListener() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		/*void*/ obj.addBoardSegmentBlockedListener(new nqueens.BlockingListener(){
			public void blocked(){
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
		expectedv = ""+obj.getUnblockedCount();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "[null]";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [public void nqueens.DefaultBoardSegment.add(nqueens.Cell)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testAdd() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		/*void*/ obj.add(new nqueens.Cell(){
			public boolean isOccupied(){
				return true;
			}
			public int getBlockLevel(){
				return 1;
			}
			public int getCol(){
				return 1;
			}
			public int getRow(){
				return 1;
			}
			public nqueens.Cell getNeighbor(nqueens.Direction p1Direction){
				return (nqueens.Cell)null;
			}
			public nqueens.CellType getCellType(){
				return (nqueens.CellType)null;
			}
			public void addCellChangeListener(nqueens.CellChangeListener p1CellChangeListener){
				return ;
			}
			public void cascadeBlockLevel(nqueens.Direction p1Direction,int p2int){
				return ;
			}
			public void flipOccupied(){
				return ;
			}
			public void reset(){
				return ;
			}

	});
		String actualv,expectedv;
		expectedv = ""+obj.isBlocked();
		actualv = "false";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getUnblockedCount();
		actualv = "1";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.toString();
		actualv = "[nqueens.CellJProbe$1@72808c3]";
		assertEquals(expectedv,actualv);
		expectedv = ""+obj.getCell(1);
		actualv = null;
		assertEquals(expectedv,actualv);
		expectedv = deepToString(obj.getEmptyCells());
		actualv = "[nqueens.CellJProbe$1@72808c3]";
		assertEquals(expectedv,actualv);

	}
	/** test case for [static java.util.List nqueens.DefaultBoardSegment.access$3(nqueens.DefaultBoardSegment)] **/
	@Test(timeout=1000)
	public void testAccess$3() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		Object expected = null;
		java.lang.reflect.Method method = nqueens.DefaultBoardSegment.class.getDeclaredMethod("access$3",new Class<?>[]{nqueens.DefaultBoardSegment.class});
		method.setAccessible(true);
		expected = method.invoke(obj,new Object[]{new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	})});
		String actual = "[]";
		assertEquals(Arrays.toString(((List<Object>) expected).toArray()),actual);

	}
	/** test case for [static int nqueens.DefaultBoardSegment.access$1(nqueens.DefaultBoardSegment)] **/
	@Test(timeout=1000)
	public void testAccess$1() throws Throwable{
		nqueens.DefaultBoardSegment obj = new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	});
		Object expected = null;
		java.lang.reflect.Method method = nqueens.DefaultBoardSegment.class.getDeclaredMethod("access$1",new Class<?>[]{nqueens.DefaultBoardSegment.class});
		method.setAccessible(true);
		expected = method.invoke(obj,new Object[]{new nqueens.DefaultBoardSegment(1,new nqueens.BlockingListener(){
			public void blocked(){
				return ;
			}
			public void unblocked(){
				return ;
			}

	})});
		int actual = (int)1;
		assertEquals(expected,actual);

	}
}