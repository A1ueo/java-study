package sec02.exam06.quiz;

public class Account {
	private String user;
	private long balance;

	public Account() {}

	public Account(String user, long balance) {
		this.user = user;
		this.balance = balance;
	}

	public String getUser() {
		return user;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%d원이 입금되었습니다. [잔액: %d원]%n", amount, balance);
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException(
					String.format("출금 실패: %d원이 부족합니다.", amount - balance));
		}
		else {
			balance -= amount;
			System.out.printf("%d원이 출금되었습니다. [잔액: %d원]%n", amount, balance);
		}
	}
}
