package ch06_4_method;

public class CarExample {
	public static void main(String[] args) throws InterruptedException {
		Car myCar = new Car();

		myCar.setGas(8); // Car�� setGas�޼ҵ� ȣ��

		boolean gasState = myCar.isLeftGas(); // isLeftGas() �޼ҵ� ȣ��
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); // Car�� run()�޼ҵ� ȣ��
		}
		if (myCar.isLeftGas()) { // ����.....? // ���̸� (boolean)�̴ϱ�
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");// ���̸� (boolean�̴ϱ�)
		} else {// �����̸�
			System.out.println("������ �����ϼ���.");
		}
	}
}
