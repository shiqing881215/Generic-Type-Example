
public class Generic<AnyType> {
	private AnyType value;
	
	public Generic(AnyType value) {
		super();
		this.value = value;
	}

	public AnyType getValue() {
		return value;
	}

	public void setValue(AnyType value) {
		this.value = value;
	}
	
	public void showType() {
		System.out.println(value.getClass().getName());
	}
}
