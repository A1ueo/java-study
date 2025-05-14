package sec04.exam04;

public class QStopExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while (true) { // 무한 반복
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            // System.out.printf("keyCode: %c\n", keyCode);\

            // q를 입력하면 종료되도록 만들기
            if (keyCode == 'Q' || keyCode == 'q')
                break;
        }
        System.out.println("종료");
    }
}
