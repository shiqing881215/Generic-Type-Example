import java.util.Collection;

/*
 * This is the restrict generic, T must be a subset of class Collection
 * When you use it, must give a concrete class, which is a disadvantage
 */
public class CollectionGeneric<T extends Collection> {
	private T value;

	public CollectionGeneric(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(value.getClass().getName());
	}
}
