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

public class CellChangeAdapterJProbeTestCase{

	private static String deepToString(final Object array){
		if(!array.getClass().isArray()){
			throw new RuntimeException(array+" is not an array");
		}
		final List<Object> list = new ArrayList<Object>();
		for(int i=0;i<Array.getLength(array);i++){
			list.add( Array.get(array, i) );
		}
		return Arrays.deepToString(list.toArray()).replaceAll("\r\n", "\\r\\n").replaceAll("\r", "\\r").replaceAll("\n", "\\n")  ;
	}	/** test case for [public void nqueens.CellChangeAdapter.undo(nqueens.Cell)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testUndo() throws Throwable{
		nqueens.CellChangeAdapter obj = new nqueens.CellChangeAdapter(){

	};
		/*void*/ obj.undo(new nqueens.Cell(){
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

	}
	/** test case for [public void nqueens.CellChangeAdapter.unblocked(nqueens.Cell)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testUnblocked() throws Throwable{
		nqueens.CellChangeAdapter obj = new nqueens.CellChangeAdapter(){

	};
		/*void*/ obj.unblocked(new nqueens.Cell(){
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

	}
	/** test case for [public void nqueens.CellChangeAdapter.queenPlaced(nqueens.Cell)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testQueenPlaced() throws Throwable{
		nqueens.CellChangeAdapter obj = new nqueens.CellChangeAdapter(){

	};
		/*void*/ obj.queenPlaced(new nqueens.Cell(){
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

	}
	/** test case for [public void nqueens.CellChangeAdapter.changed(nqueens.Cell,boolean,int)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testChanged() throws Throwable{
		nqueens.CellChangeAdapter obj = new nqueens.CellChangeAdapter(){

	};
		/*void*/ obj.changed(new nqueens.Cell(){
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

	},true,1);
		String actualv,expectedv;

	}
	/** test case for [public void nqueens.CellChangeAdapter.blocked(nqueens.Cell)] **/
	@Test(expected=Throwable.class,timeout=1000)
	public void testBlocked() throws Throwable{
		nqueens.CellChangeAdapter obj = new nqueens.CellChangeAdapter(){

	};
		/*void*/ obj.blocked(new nqueens.Cell(){
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

	}
}