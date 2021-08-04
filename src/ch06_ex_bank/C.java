package ch06_ex_bank;

import ch06_6_AccessKeyword.A;

public class C {
	//필드
	A a1 = new A(true); // public이라 다른 패키지에서 가능  // Ctrl+shift+O == 자동 imprt
//	A a1 = new A(1); //불가
//	A a1 = new A("문자열");  //불가
	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; //다른패키지 접근불가(default)
//		a.field3 = 1;
		
		a.method1();
//		a.method2(); //다른 패키지 접근불가
//		a.method3();
	}
}
