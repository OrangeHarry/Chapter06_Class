package ch06_4_method;

public class Calculator {

	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	int multiply(int x, int y) {
		return x * y;
	}

	double divide(int x, int y) {
		if (y == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0; // �� ����� �����ϸ� �ٷ� �������� ����
		}
		double result = (double) x / y;
		System.out.println("var4 = "+result);
		return result;
	}

	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
