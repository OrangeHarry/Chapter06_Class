package ch06_4_method;

public class Car {

	// �ʵ�
	int gas;

	// ������
//	�����ڸ� ���� ������� �ʾ����� new�����Ҷ� �⺻ �����ڸ� ȣ���Ѵ�.

	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() { //boolean ��������!!
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

	void run() throws InterruptedException {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�~(gas�ܷ� = " + gas + ")");
				gas--;
//				gas -= 1;
//				gas = gas -1;
				Thread.sleep(500);
			} else {
				System.out.println("����!!(gas�ܷ� = " + gas + ")");
				return; // �޼ҵ� ���� ����
			}
		}
	}
}
