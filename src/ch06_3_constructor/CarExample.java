package ch06_3_constructor;

public class CarExample {
	public static void main(String[] args) {
//		Car car = new Car(); //�⺻ �����ڴ� ȣ���� �� ����. Car���� �����ڸ� ���������
		Car myCar = new Car("�����", "ī�Ϲ�", "���" ,"����1");
		
		//�ʵ尪 �б�
		System.out.println("����ȸ�� = " + myCar.company);
		System.out.println("�𵨸� = " + myCar.model);
		System.out.println("���� = " + myCar.color);
		System.out.println("���� = " + myCar.engin);
		System.out.println("�ְ�ӵ� = " + myCar.maxSpeed);
		System.out.println("����ӵ� = " + myCar.speed);
		System.out.println("======================================");
		
		Car secondCar = new Car("������", "�ƹݶ�", "�׷���", "����");
		System.out.println("����ȸ�� = " + secondCar.company);
		System.out.println("�𵨸� = " + secondCar.model);
		System.out.println("���� = " + secondCar.color);
		System.out.println("���� = " + secondCar.engin);
		System.out.println("�ְ�ӵ� = " + secondCar.maxSpeed);
		System.out.println("����ӵ� = " + secondCar.speed);
	}
}
