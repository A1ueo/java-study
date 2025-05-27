package sec02.exam06;

public class UserService {
	public void registerUser(int age) throws InvaildAgeException {
		if (age < 0) {
			// 예외 발생시키기
//			throw new InvaildInputException("범용 예외를 만들고 메세지로 구분");
			throw new InvaildAgeException("나이는 0보다 작을 수 없습니다."); // 예외 메세지 작성
			// 메세지를 통해 무슨 오류인지 명확하게 표현할 수 있음
		}

		System.out.println("사용자 등록 완료 (나이: " + age + ")");
	}
}
