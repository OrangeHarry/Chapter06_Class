package ch06_4_method;

public class Refrigerator {

	void open() {
		System.out.println("����� ���� ������.");
	}

	void close() {
		System.out.println("����� ���� ������");
	}

	boolean isDoorOpen(boolean isDoorOpen) {
		if (isDoorOpen == true) {
			System.out.println("������� ����� �����Դϴ�.");
			return true;
		}
		System.out.println("����� ����!!!!");
		return false;
	}

	void runFreeze() {
		System.out.println("�õ���� ��밡��");
	}

	String modelName(String name) {
		System.out.println(name);
		return name;
	}

	int temperature(int x) {
		System.out.println(x + "��");
		return x;
	}

}
