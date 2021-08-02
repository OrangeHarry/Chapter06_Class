package ch06_4_method;

public class Calculator {

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
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
			System.out.println("0으로 나눌 수 없습니다.");
			return 0; // 오 여기다 리턴하면 바로 빠져나가 좋다
		}
		double result = (double) x / y;
		System.out.println("var4 = "+result);
		return result;
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
