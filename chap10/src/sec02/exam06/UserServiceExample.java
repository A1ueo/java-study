package sec02.exam06;

public class UserServiceExample {
	public static void main(String[] args) {
		UserService service = new UserService();

		try {
			service.registerUser(10);
			service.registerUser(-1);
		} catch (InvaildAgeException e) { // e: 예외 객체
			System.out.println("예외 발생: " + e.getMessage());

		}
	}
}
