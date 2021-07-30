package ch06_2_field;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성(인스턴스화)
		Car myCar = new Car();// 생성자가 숨어있다?

		// 필드값 읽기
		System.out.println("제작회사 = " + myCar.company);
		System.out.println("모델명 = " + myCar.model);
		System.out.println("색깔 = " + myCar.color);
		System.out.println("최고속도 = " + myCar.maxSpeed);
		System.out.println("현재속도 = " + myCar.speed);

		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 = " + myCar.speed);
	}
}
