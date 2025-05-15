package homework;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("한 자리 숫자를 입력하세요: ");
        char c = sc.nextLine().charAt(0);
        int num = c - '0';
        System.out.printf("입력한 숫자의 제곱은 %d입니다.\n", num * num);
    }
}
