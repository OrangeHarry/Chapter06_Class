package ch06_4_method;

public class CheckProc {
	public static void main(String[] args) {
		int checkState = -1;
		int loadingState = -1;
		
		int state = 0;
		
		checkState = checkVersion();
		System.out.println(checkState);
		
		loadingState = loading();
		
//		int install();
//		int delete();
	}

	private static int loading() {

		return 0;
	}

	private static int checkVersion() {
		System.out.println("������ üũ�մϴ�.");
//		~~~
//		~~~
//		~~~
		return 0; // �޼ҵ� �ȿ� ������ �� ����ǰ� �ֳ� Ȯ���ϱ� ���ؼ� void�� �ƴ� ���ϰ���
		          // �ִ� int�� Ÿ������ ��������.(��....�׷� �������־���)
	}
}
//�� �������� �޼ҵ���� �� ���������� ������ �Ǵ����� üũ�ϰ� �;�
//�̰� �� ���ҳ� �ȵ��ҳĸ� Ȯ���ϱ� ���ؼ� ���ϰ��� �ִ� int������ ����ų� �ؼ� Ȯ�����Ѵ�.