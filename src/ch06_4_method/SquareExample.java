package ch06_4_method;

public class SquareExample {
	public static void main(String[] args) {
		Square mySqu = new Square();

		double result1 = mySqu.areaRectangle(10);
		double result2 = mySqu.areaRectangle(10, 20);

		System.out.println("���簢���� ���� = " + result1);
		System.out.println("���簢���� ���� = " + result2);
	}
}
