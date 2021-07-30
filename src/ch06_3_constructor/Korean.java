package ch06_3_constructor;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn; // 주민번호인가봐
	
	//생성자
	public Korean(String n, String s) {
		name = n;       //필드랑 같은 이름을 쓸 경우 밑에 값처리가 
		ssn = s;        //헷갈릴 수 있어서 this를 사용하는 이유도 있다.
	}
}
