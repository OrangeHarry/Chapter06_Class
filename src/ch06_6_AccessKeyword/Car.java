package ch06_6_AccessKeyword;

public class Car {
	// �ʵ�
	private int speed;
	private boolean stop;

	// ������

	// �޼ҵ�
	//getter
	public int getSpeed() { //����Ÿ�� = �ʵ�Ÿ��
		return speed;
	}
    //setter
	public void setSpeed(int speed) {// ����Ÿ�� = void
		//���� ���� ������ �־��� �� �ִ�. �ǹ����� ���� �߿��� �� �ۿ� ����
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
//Ŭ������ �̷��� �ۼ��ؾߵȴ�!!