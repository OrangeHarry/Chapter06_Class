package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] vars = { 10, 20, 30 };
		myCom.intList = vars;
		System.out.println("myCom.sum() = " + myCom.sum());

		int[] values1 = { 1, 2, 3 };
//		int result1 = myCom.sum1(values1);
//		System.out.println("result = " + result1);
		System.out.println("myCom.sum1(values1) = " + myCom.sum1(values1));

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2 = " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 = " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 = " + result4);

	}
}
