package ch06_5_instance_static;

/*
 * 싱글톤 객체 만들기
 * 전체 프로그램에서 only 1개의 객체 생성
 */

public class Singleton {
	
	//정적 필드(생성된 객체 [1개]의 참조변수 생성)
	private static Singleton ref = new Singleton(); //new로 인해서 1개의 인스턴스(객체) 생성 
	               //클래스                                  //클래스
	
	//private 생성자
	//외부에서 생성자 호출이 안되도록
	private Singleton() {
		System.out.println("Singlton Constructor");
	}
	
	//정적 메소드
	static Singleton getInstance() {
		  //클래스            //주소반환
		return ref;
	}
}
