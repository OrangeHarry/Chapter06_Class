package ch06_3_constructor;

public class Car2 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	Car2() {// ������1

	}

	Car2(String model) {// ������2
		this(model, "����", 250); // �𵨸� �Է������� ����, 250�� ������ ���� ���´� ���
		             // �⺻ �Է°��� �̰Ŵٶ� ���
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 200;
	}

	Car2(String model, String color) {// ������3
		this(model, color, 250);
//		this.model = model;
//		this.color = color;
	}

	Car2(String model, String color, int maxSpeed) {// ������3
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
