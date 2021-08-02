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
		System.out.println("버전을 체크합니다.");
//		~~~
//		~~~
//		~~~
		return 0; // 메소드 안에 내용이 잘 실행되고 있나 확인하기 위해서 void가 아닌 리턴값이
		          // 있는 int형 타입으로 만들어줬다.(오....그런 이유가있었넹)
	}
}
//다 만들어놓고 메소드들이 다 정상적으로 실행이 되는지를 체크하고 싶어
//이게 다 돌았냐 안돌았냐를 확인하기 위해서 리턴값이 있는 int형으로 만들거나 해서 확인을한다.