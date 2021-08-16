package ch06_3_constructor;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car2() {// 생성자1

	}

	Car2(String model) {// 생성자2
		this(model, "은색", 250); // 모델명만 입력했을때 은색, 250은 무조건 같이 나온단 얘기
		             // 기본 입력값이 이거다란 얘기
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 200;
	}

	Car2(String model, String color) {// 생성자3
		this(model, color, 250);
//		this.model = model;
//		this.color = color;
	}

	Car2(String model, String color, int maxSpeed) {// 생성자3
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
