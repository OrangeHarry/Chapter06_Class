package ch06_5_instance_static;

public class Calculator {
	// �ʵ�
	static double pi = 3.14159;
//	int x;
//	int y;
	

	// ������

	// �޼ҵ�
	static int plus(int x, int y) {
//		return this.x +this.y; //static�̶� �̷��� ������.
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
