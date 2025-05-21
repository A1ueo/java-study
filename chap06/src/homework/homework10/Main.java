package homework.homework10;

public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-654-321", 50000);

		acc1.Withdraw(30000);
		acc2.Deposit(100000);

		Bank bank = new Bank();
		bank.Transfer(acc1, acc2, 50000);

		System.out.printf("%s 계좌 잔고: %d%n", acc1.getAccountNumber(), acc1.getBalance());
		System.out.printf("%s 계좌 잔고: %d%n", acc2.getAccountNumber(), acc2.getBalance());

	}

}
