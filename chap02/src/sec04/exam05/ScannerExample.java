package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = scanner.nextLine(); // 스캐너에서 읽은 한 라인 전체(엔터키 이전까지)
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            
            if(inputData.equals("Q") || inputData.equals("q") || 
            		inputData.equals("ㅂ") || inputData.equals("ㅃ")) {
            	break;
            }
        }
        System.out.println("종료");
        
        // Quiz
        // 2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오. 
        // [입력]	[출력]
        // 10 20 => 10, 20
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();
        System.out.printf("%d, %d\n", inputNum1, inputNum2);
    }
}
