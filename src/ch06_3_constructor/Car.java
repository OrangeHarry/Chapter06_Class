package ch06_3_constructor;

public class Car {
	    //�ʵ�
		String company = "";
		String model = "";
		String color = "";
		String engin = "";
		int maxSpeed = 350;
		int speed;
		
		//������
		public Car(String company, String model, String color, String engin) {
			super();
			this.company = company;
			this.model = model;
			this.color = color;
			this.engin = engin;
		}
	}
