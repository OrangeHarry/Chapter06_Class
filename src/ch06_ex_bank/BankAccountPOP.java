package ch06_ex_bank;

/*
 * 은행계좌 기능 구현 클래스
 */

public class BankAccountPOP {
	// 계좌 잔고 초기화 (int 잔고 = 0;)
	static int balance = 0;

	public static void main(String[] args) {

		// 계좌 입금
		// ->계좌 입금 하기
		deposit(10000);

		// 계좌 출금
		// ->계좌 출금 하기
		withdrawal(3000);

		// 계좌 잔고 출력
		checkBalance();
		
		withdrawal(1000);
		deposit(30000);
		checkBalance();
	}

	static void checkBalance() {
		System.out.println("현재잔고 = " + balance);
	}

	static void withdrawal(int withdrawalAmount) {
		balance = balance - withdrawalAmount;
	}

	static int deposit(int depositAmount) {
		balance = balance + depositAmount;
		return balance;
		// 한 클래스내에 있는 필드를 메소드로 가져올때 new연산자를 사용하지 않으려면 static을 활용하면 된다.
	}
}
