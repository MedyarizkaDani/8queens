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

public class BoardChangeAdapterJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public void nqueens.BoardChangeAdapter.unblocked()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testUnblocked() throws Throwable{
		nqueens.BoardChangeAdapter obj = new nqueens.BoardChangeAdapter(){

	};
		/*void*/ obj.unblocked();
		String actualv,expectedv;

	}
	/** test case for [public void nqueens.BoardChangeAdapter.onChanged()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testOnChanged() throws Throwable{
		nqueens.BoardChangeAdapter obj = new nqueens.BoardChangeAdapter(){

	};
		/*void*/ obj.onChanged();
		String actualv,expectedv;

	}
	/** test case for [public void nqueens.BoardChangeAdapter.blocked()] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testBlocked() throws Throwable{
		nqueens.BoardChangeAdapter obj = new nqueens.BoardChangeAdapter(){

	};
		/*void*/ obj.blocked();
		String actualv,expectedv;

	}
}