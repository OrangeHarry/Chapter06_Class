package ch06_3_constructor;

public class CircleExample {
	public static void main(String[] args) {
		Circle c1= new Circle(1);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(100);
//		이런식으로 쓰는거지 모
		System.out.println(c3.rad);
	}
}
