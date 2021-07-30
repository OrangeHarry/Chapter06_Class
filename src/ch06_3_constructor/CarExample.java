package ch06_3_constructor;

public class CarExample {
	public static void main(String[] args) {
//		Car car = new Car(); //기본 생성자는 호출할 수 없다. Car에서 생성자를 만들었으니
		Car myCar = new Car("기아차", "카니발", "흰색" ,"디젤1");
		
		//필드값 읽기
		System.out.println("제작회사 = " + myCar.company);
		System.out.println("모델명 = " + myCar.model);
		System.out.println("색깔 = " + myCar.color);
		System.out.println("엔진 = " + myCar.engin);
		System.out.println("최고속도 = " + myCar.maxSpeed);
		System.out.println("현재속도 = " + myCar.speed);
		System.out.println("======================================");
		
		Car secondCar = new Car("현대차", "아반떼", "그레이", "디젤");
		System.out.println("제작회사 = " + secondCar.company);
		System.out.println("모델명 = " + secondCar.model);
		System.out.println("색깔 = " + secondCar.color);
		System.out.println("엔진 = " + secondCar.engin);
		System.out.println("최고속도 = " + secondCar.maxSpeed);
		System.out.println("현재속도 = " + secondCar.speed);
	}
}
