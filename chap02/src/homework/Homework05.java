package homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어: ");
        int kor = sc.nextInt();
        System.out.print("영어: ");
        int eng = sc.nextInt();
        System.out.print("수학: ");
        int math = sc.nextInt();
        int total = kor + eng + math;
        System.out.println("총점: " + total);
        System.out.println("평균: " + total / 3);
    }
}
