package ch06_5_instance_static;

public class staticª������ {
	public static void main(String[] args) {
		System.out.println(A.pi); // new�� ���ϰ� Ŭ���� �̸�.���� �ٷ� �� ���� �ֳ�
	}
}
//���� 270��
class A {
	static double pi = 3.141592;
	// ��� AŬ���� �ȿ� ��������� ������ Ŭ���� �ۿ� �����ִ°Ŷ�� �����ص� �ȴ�.(�޸𸮻�����)
    //(�׷��� ������ �ۿ��ٰ� �����ϸ� �ȵȴ�, �ڹٴ� ��ü�����̴ϱ� Ŭ���� �ȿ��� �����ؾ�¡)
	// �������� ������ �������̶� ������ �����ݾ�
	// ���� Ŭ������ �ϳ��ϳ��� �� �ʿ䰡 ���°��� (�޸� �����ڳ�)

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
