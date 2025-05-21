package homework.homework10;

public class Bank {

	void Transfer(Account sender, Account receiver, int amount) {
		if (sender.getBalance() < amount) {
			System.out.println("잔금이 부족합니다.");
		} else {
			sender.Withdraw(amount);
			receiver.Deposit(amount);
			System.out.println("송금 완료");
			System.out.println("잔고: " + sender.getBalance());
		}
	}

}
