package ch06_5_instance_static;

public class static짧은설명 {
	public static void main(String[] args) {
		System.out.println(A.pi); // new를 안하고 클래스 이름.으로 바로 쓸 수가 있네
	}
}
//예시 270쪽
class A {
	static double pi = 3.141592;
	// 얘는 A클래스 안에 들어있지만 성질은 클래스 밖에 나와있는거라고 이해해도 된다.(메모리상으론)
    //(그런데 실제로 밖에다가 선언하면 안된다, 자바는 객체지향이니깐 클래스 안에서 선언해야징)
	// 원주율은 어차피 원주율이라 정해진 값이잖아
	// 굳이 클래스에 하나하나씩 할 필요가 없는거지 (메모리 낭비자나)

	String name;
}

class B {
	double pi = 3.141592;
	String name;
}

class C {
	double pi = 3.141592;
	String name;
}
