package sec06.exam06;

public class Car {
	// 필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private으로 선언
	private int speed;
	private boolean stop;

	// 메소드
	public int getSpeed() { // 만약 getter만 존재하면, 읽기 전용 필드
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop) {
			speed = 0;
		}
	}

	// Quiz: Getter/Setter 만들기
//	public boolean isStop() {
//		return stop;
//	}
//
//	public void setStop(boolean stop) {
//		this.stop = stop;
//	}

}
