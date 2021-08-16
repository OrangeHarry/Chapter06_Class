package ch06_5_instance_static;

public class PersonExample {

	public static void main(String[]args) {
		Person p1 = new Person("931126-1234567", "하헌민");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA" //컴파일 에러
//		P1.ssn = "931126-1111111"; //컴파일에러
		p1.name = "송병언";
	}
}
