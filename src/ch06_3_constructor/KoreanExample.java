package ch06_3_constructor;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("�����", "931126-1111111");
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.ssn = " + k1.ssn);

		Korean k2 = new Korean("����", "901228-2222222");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
