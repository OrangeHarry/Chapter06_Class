package ch06_6_AccessKeyword;

public class B {
	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
//	A a3 = new A("���ڿ�") // private �����ڶ� ���ٺҰ�
	
	
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //private�� ���ٺҰ�
		
		a.method1();
		a.method2();
//		a.method3(); //private�� ���ٺҰ�
	}
}
