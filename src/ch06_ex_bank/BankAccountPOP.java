package ch06_ex_bank;

/*
 * ������� ��� ���� Ŭ����
 */

public class BankAccountPOP {
	// ���� �ܰ� �ʱ�ȭ (int �ܰ� = 0;)
	static int balance = 0;

	public static void main(String[] args) {

		// ���� �Ա�
		// ->���� �Ա� �ϱ�
		deposit(10000);

		// ���� ���
		// ->���� ��� �ϱ�
		withdrawal(3000);

		// ���� �ܰ� ���
		checkBalance();
		
		withdrawal(1000);
		deposit(30000);
		checkBalance();
	}

	static void checkBalance() {
		System.out.println("�����ܰ� = " + balance);
	}

	static void withdrawal(int withdrawalAmount) {
		balance = balance - withdrawalAmount;
	}

	static int deposit(int depositAmount) {
		balance = balance + depositAmount;
		return balance;
		// �� Ŭ�������� �ִ� �ʵ带 �޼ҵ�� �����ö� new�����ڸ� ������� �������� static�� Ȱ���ϸ� �ȴ�.
	}
}
