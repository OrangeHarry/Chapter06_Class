package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
//		                  new �Ҷ� �����ڸ� �׻� ȣ���ϴ� �Ŷ�� �����ϸ� �°� �����ϱ� ����
		System.out.println(st1.num);//������ ������
		
		
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
//		st1.num = 2012057030;
		st1.setNum(1);
		
		Student st2 = new Student();
		System.out.println("s2 ������ Student ��ü�� �����մϴ�.");
//		st2.num = 2013057025;
		st2.setNum(2)
		;
		System.out.println(st1.getNum());
		System.out.println(st2.getNum());
	}
}
