package ch06_4_method;

public class CarExample {
	public static void main(String[] args) throws InterruptedException {
		Car myCar = new Car();

		myCar.setGas(8); // Car의 setGas메소드 호출

		boolean gasState = myCar.isLeftGas(); // isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run()메소드 호출
		}
		if (myCar.isLeftGas()) { // 뭐지.....? // 참이면 (boolean)이니깐
			System.out.println("가스를 주입할 필요가 없습니다.");// 참이면 (boolean이니깐)
		} else {// 거짓이면
			System.out.println("가스를 주입하세요.");
		}
	}
}
