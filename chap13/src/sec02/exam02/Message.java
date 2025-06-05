package sec02.exam02;

public class Message /* implements Comparable<Message> */ {
	public String command; // 메세지를 어떻게 처리할지
	public String to; // 누구에게 보낼지
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

//	@Override
//	public int compareTo(Message o) {
//		return 1;
//	}
	
}
