package ch06_ex_bank;

import ch06_6_AccessKeyword.A;

public class C {
	//�ʵ�
	A a1 = new A(true); // public�̶� �ٸ� ��Ű������ ����  // Ctrl+shift+O == �ڵ� imprt
//	A a1 = new A(1); //�Ұ�
//	A a1 = new A("���ڿ�");  //�Ұ�
	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; //�ٸ���Ű�� ���ٺҰ�(default)
//		a.field3 = 1;
		
		a.method1();
//		a.method2(); //�ٸ� ��Ű�� ���ٺҰ�
//		a.method3();
	}
}
