import java.util.ArrayList;
import java.util.Collection;


public class WildcardGenericTest {
	public static void main(String[] args) {
		// When you use ? wildcard, will solve this issue.
		CollectionGeneric<? extends Collection> c = new CollectionGeneric<ArrayList>(new ArrayList());
		c.print();
	}
}
