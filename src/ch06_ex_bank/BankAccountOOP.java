package ch06_ex_bank;

public class BankAccountOOP {
	public static void main(String[] args) {
		BankAccount kimAccount = new BankAccount("Kim");

		kimAccount.deposit(10000);
		kimAccount.withdraw(3000);
		kimAccount.checkBalance(); // �޼ҵ带 ������
		
		BankAccount leeAcount = new BankAccount("lee", "777-777", 1000);
		leeAcount.deposit(10000);
		leeAcount.checkBalance();
	}
}