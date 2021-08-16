package ch06_5_instance_static;

public class Person {
	final String nation = "korea";
	final String ssn; //주민번호 같은거
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
