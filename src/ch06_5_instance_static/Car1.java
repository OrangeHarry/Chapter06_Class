package ch06_5_instance_static;

public class Car1 {
	int speed;

	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.speed = 60;
		myCar.run();
	}
}
