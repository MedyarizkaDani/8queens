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

public class NQueensJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [int[] nqueens.NQueens.solve()] **/
	@Test(timeout=1000)
	public void testSolve() throws Throwable{
		nqueens.NQueens obj = new nqueens.NQueens(1);
		Object expected = null;
		java.lang.reflect.Method method = nqueens.NQueens.class.getDeclaredMethod("solve",new Class<?>[]{});
		method.setAccessible(true);
		expected = method.invoke(obj,new Object[]{});
		String actual = "[0]";
		assertEquals(Arrays.toString((int[])expected),actual);

	}
	/** test case for [public static void nqueens.NQueens.main(java.lang.String[])] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testMain() throws Throwable{
		nqueens.NQueens obj = new nqueens.NQueens(1);
		/*void*/ obj.main(new java.lang.String[]{"Object.class"});
		String actualv,expectedv;

	}
}