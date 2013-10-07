
public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Generic<Double> g1 = new Generic<Double>(9.0);
		g1.showType();
		Generic<String> g2 = new Generic<String>("9.0");
		g2.showType();
	}
}
