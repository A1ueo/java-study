package homework.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요: ");
		String word = sc.nextLine();
		
		String[] strArr = sentence.split(" ");
		int idx = 0;
		boolean hasWord = false;
		for(String s : strArr) {
			idx++;
			if(s.equals(word)) {
				hasWord = true;
				break;
			}
		}
		
		if(!hasWord) {
			System.out.println("존재하지 않는 단어입니다.");
		}
		else if(idx == strArr.length) {
			System.out.println("마지막 단어입니다.");
		}
		else {
			System.out.println(word + " 다음 단어: " + strArr[idx]);
		}
	}

}
