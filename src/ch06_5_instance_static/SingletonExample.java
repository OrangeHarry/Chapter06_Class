package ch06_5_instance_static;

public class SingletonExample {
	public static void main(String[] args) {

//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton(); 컴파일 에러

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2); //오호 같은 주소값이라

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
