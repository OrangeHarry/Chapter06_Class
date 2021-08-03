package ch06_5_instance_static;

public class SingletonExample {
	public static void main(String[] args) {

//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton(); ������ ����

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2); //��ȣ ���� �ּҰ��̶�

		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}
