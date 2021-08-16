package ch06_6_AccessKeyword;

public class Car {
	// 필드
	private int speed;
	private boolean stop;

	// 생성자

	// 메소드
	//getter
	public int getSpeed() { //리턴타입 = 필드타입
		return speed;
	}
    //setter
	public void setSpeed(int speed) {// 리턴타입 = void
		//값에 대한 검증을 넣어줄 수 있다. 실무에서 정말 중요할 수 밖에 없네
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	//getter
	public boolean isStop() {
		return stop;
	}
	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
//클래스는 이렇게 작성해야된다!!