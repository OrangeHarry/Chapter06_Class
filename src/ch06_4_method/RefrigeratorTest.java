package ch06_4_method;

public class RefrigeratorTest {
	public static void main(String[] args) {
		Refrigerator myRef = new Refrigerator();

		myRef.open();
		myRef.close();
		myRef.isDoorOpen(true);
		myRef.runFreeze();
		myRef.modelName("»ï¼º");
		myRef.temperature(-20);

	}
}
