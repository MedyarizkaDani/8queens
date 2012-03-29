package main;

import java.util.Collection;
import java.util.Iterator;
/**
 * declarative utilties
 * @author Hussain Al-Mutawa
 * @version 1.0
 * @since 1.0
 */
public class Utils {

	public static <T> void map(final Collection<T> list, final MapFunction<T> mapFunction) {
		final Iterator<T>it=list.iterator();
		for (int index=0;it.hasNext();++index) {
			mapFunction.map(index,it.next());
		}
	}

}
