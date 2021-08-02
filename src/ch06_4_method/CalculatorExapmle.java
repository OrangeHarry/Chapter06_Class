package ch06_4_method;

public class CalculatorExapmle {
	public static void main(String[] args) {

		Calculator myCalc = new Calculator();

		// 계산기 켜기
		myCalc.powerOn();

		// 계산하기
		int var1 = myCalc.plus(8, 8);
		System.out.println("var1 = " + var1);

		int var2 = myCalc.minus(5, 4);
		System.out.println("var2 = " + var2);

		int var3 = myCalc.multiply(6, 5);
		System.out.println("var3 = " + var3);

		byte x = 10;
		byte y = 4;
		double var4 = myCalc.divide(x, y);
//		System.out.println("var4 = " + var4);

		// 계산기 끄기
		myCalc.powerOff();
	}
}
