package ch06_4_method;

public class Car {

	// 필드
	int gas;

	// 생성자
//	생성자를 따로 선언되지 않았으니 new생성할때 기본 생성자를 호출한다.

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() { //boolean 공부하자!!
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() throws InterruptedException {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다~(gas잔량 = " + gas + ")");
				gas--;
//				gas -= 1;
//				gas = gas -1;
				Thread.sleep(500);
			} else {
				System.out.println("멈춰!!(gas잔량 = " + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}
}
