package ch06_4_method;

public class Car2 {
	// �ʵ�
	int speed;

	// ������

	// �޼ҵ�
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}

	void run() {                 // �ǹ����� �������� �ʴ´�,for���� �⺻������ Ƚ���� ���� �ݺ��� ���Ͽ� ����ϱ� ����
		for (int i = 0; i <= 50; i += 10) {// i+=10�� i�� 1���� �ƴ� 10�� �����Ѵ�!!(10�� �������ݴ�)
			speed = i;
			System.out.println("�޸���~(�ü�: " + speed + "km/h)");
		}
	}
}
