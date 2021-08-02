package ch06_4_method;

public class MemberService {
//	String id;
//	String paswword;  //굳이 필드 선언을 할 필요가 없었다.

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
