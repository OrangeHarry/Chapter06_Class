package ch06_3_constructor;

public class Car {
	    //필드
		String company = "";
		String model = "";
		String color = "";
		String engin = "";
		int maxSpeed = 350;
		int speed;
		
		//생성자
		public Car(String company, String model, String color, String engin) {
			super();
			this.company = company;
			this.model = model;
			this.color = color;
			this.engin = engin;
		}
	}
