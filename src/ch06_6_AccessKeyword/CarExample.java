package ch06_6_AccessKeyword;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(-50);// 잘못된 속도변경
		System.out.println("현재속도 = " + myCar.getSpeed());

		myCar.setSpeed(60);// 올바른 속도변경
		System.out.println("현재속도 = " + myCar.getSpeed());

		// 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 = " + myCar.getSpeed());
//		System.out.println("stop 했니?? "+myCar.isStop());
	}
}
