package ch06_4_method;

public class Car2 {
	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {                 // 실무에서 사용되지는 않는다,for문은 기본적으로 횟수에 대한 반복을 위하여 사용하기 때문
		for (int i = 0; i <= 50; i += 10) {// i+=10은 i가 1씩이 아닌 10씩 증가한다!!(10씩 더해줬잖니)
			speed = i;
			System.out.println("달린다~(시속: " + speed + "km/h)");
		}
	}
}
