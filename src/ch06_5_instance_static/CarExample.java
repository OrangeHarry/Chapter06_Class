package ch06_5_instance_static;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");

		myCar.run(); //힙메모리에 저장된게 아니라 메소드메모리에 저장된것!!
		yourCar.run();
	}
}
