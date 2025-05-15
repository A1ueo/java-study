package homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어: ");
        double kor = sc.nextDouble();
        System.out.print("영어: ");
        double eng = sc.nextDouble();
        System.out.print("수학: ");
        double math = sc.nextDouble();
        int total = (int) (kor + eng + math);
        System.out.println("총점: " + total);
        System.out.println("평균: " + total / 3);
    }
}
