package ch06_4_method;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");

		if (result) { // result�� ���϶�
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else { // result�� �����϶�
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
