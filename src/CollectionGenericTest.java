import java.util.ArrayList;
import java.util.Collection;


public class CollectionGenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// When you use restrict generic, you must define which class to use in the runtime.
		CollectionGeneric<ArrayList> c = new CollectionGeneric<ArrayList>(new ArrayList());
		c.print();
		
		// This gives the error, String is not children of collection
//		CollectionGeneric<String> c2 = new CollectionGeneric<String>("String");
		
		CollectionGeneric<Collection> c2 = new CollectionGeneric<Collection>(new ArrayList());
		c2.print();
		
		// This will gives the error, because the leftside can be another children of collection
		// so this will cause type mismatch
		// This issue can be solved by using wildcard, see WildcardGenericTest
//		CollectionGeneric<Collection> c3 = new CollectionGeneric<ArrayList>(new ArrayList());
	}

}
