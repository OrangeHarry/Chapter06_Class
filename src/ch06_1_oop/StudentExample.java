package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
//		                  new 할때 생성자를 항상 호출하는 거라고 생각하면 맞고 이해하기 편함
		System.out.println(st1.num);//생성자 봐보기
		
		
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
//		st1.num = 2012057030;
		st1.setNum(1);
		
		Student st2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
//		st2.num = 2013057025;
		st2.setNum(2)
		;
		System.out.println(st1.getNum());
		System.out.println(st2.getNum());
	}
}
