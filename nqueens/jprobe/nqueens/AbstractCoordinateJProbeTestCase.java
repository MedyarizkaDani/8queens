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

public class AbstractCoordinateJProbeTestCase{

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
		nqueens.AbstractCoordinate obj = new nqueens.AbstractCoordinate(1,1);
		java.lang.String expected = obj.toString();
		java.lang.String actual = "1/1";
		assertEquals(expected,actual);

	}
	/** test case for [public int nqueens.AbstractCoordinate.getRow()] **/
	@Test(timeout=1000)
	public void testGetRow() throws Throwable{
		nqueens.AbstractCoordinate obj = new nqueens.AbstractCoordinate(1,1);
		int expected = obj.getRow();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
	/** test case for [public int nqueens.AbstractCoordinate.getCol()] **/
	@Test(timeout=1000)
	public void testGetCol() throws Throwable{
		nqueens.AbstractCoordinate obj = new nqueens.AbstractCoordinate(1,1);
		int expected = obj.getCol();
		int actual = (int)1;
		assertEquals(expected,actual);

	}
}