package sec02.exam02;

import java.util.PriorityQueue;
import java.util.Queue;

// Queue를 이용한 간단한 메세지 큐를 구현한 예제
// 먼저 넣은 메세지가 반대쪽으로 먼저 나오기 때문에 넣는 순서대로 메세지가 처리됨
// => FIFO(선입선출)
public class QueueExample {
	public static void main(String[] args) {
//		Queue<Message> messageQueue = new LinkedList<Message>();
		// 우선순위 비교를 위해 compareTo를 구현해야 됨, 1을 리턴하면 들어온 순서대로
		Queue<Message> messageQueue = new PriorityQueue<Message>((x, y) -> 1);
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "철수"));
		messageQueue.offer(new Message("sendSMS", "영희"));
		messageQueue.offer(new Message("sendKakaotalk", "바둑이"));
		
		// 메세지 큐가 비었는지 확인
		while (!messageQueue.isEmpty()) {
			// 메세지 큐에서 1개의 메세지 꺼냄
			Message message = messageQueue.poll();
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
	}
}
