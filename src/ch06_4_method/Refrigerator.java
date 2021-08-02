package ch06_4_method;

public class Refrigerator {

	void open() {
		System.out.println("냉장고 문은 열린다.");
	}

	void close() {
		System.out.println("냉장고 문은 닫힌다");
	}

	boolean isDoorOpen(boolean isDoorOpen) {
		if (isDoorOpen == true) {
			System.out.println("냉장고문의 기능이 정상입니다.");
			return true;
		}
		System.out.println("냉장고문 고장!!!!");
		return false;
	}

	void runFreeze() {
		System.out.println("냉동기능 사용가능");
	}

	String modelName(String name) {
		System.out.println(name);
		return name;
	}

	int temperature(int x) {
		System.out.println(x + "도");
		return x;
	}

}
