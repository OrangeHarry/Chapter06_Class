package ch06_4_method;

public class MemberService {
//	String id;
//	String paswword;  //���� �ʵ� ������ �� �ʿ䰡 ������.

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
