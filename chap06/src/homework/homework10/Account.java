package homework.homework10;

public class Account {
	private String accountNumber;
	private int balance;

	public Account() {
	}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void Deposit(int amount) {
		balance += amount;
	}

	public void Withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} else
			System.out.println("잔금이 부족합니다.");
	}

}
