package homework;

import java.io.IOException;

public class Homework04 {
    public static void main(String[] args) throws IOException {
        System.out.print("문자를 입력하세요: ");
        int key = System.in.read();
        System.out.printf("%c의 유니코드: %d", key, key);
    }
}
