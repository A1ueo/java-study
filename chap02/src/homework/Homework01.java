package homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요.(m): ");
        double height = sc.nextDouble();
        System.out.print("몸무게를 입력하세요.(kg): ");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI 지수: " + bmi);
    }
}
