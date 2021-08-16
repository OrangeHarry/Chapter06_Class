package ch06_4_method;

public class Printer {

//	int println(int x) {
//		System.out.println(x);
//		return 0;
//	}
//
//	boolean println(boolean println) {
//		if (println == true) {
//			System.out.println("true입니다.");
//			return true;
//		}
//		System.out.println("false입니다.");
//		return false;
//	}
//	double println(double x) {
//		System.out.println(x);
//		return 0;
//	}
//	String println(String println) {
//		System.out.println(println);
//		return " ";
//	} 
//	값은 잘나오나 굳이 리턴값이 필요없는 메소드로 사용가능하므로 전부 void로 하자

	void println(int value) {
		System.out.println(value);
	}

	void println(boolean value) {
		System.out.println(value);
	}

	void println(double value) {
		System.out.println(value);
	}

	void println(String value) {
		System.out.println(value);
	}
}
