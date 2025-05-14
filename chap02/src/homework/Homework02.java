package homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로: ");
        double row = sc.nextDouble();
        System.out.print("세로: ");
        double col = sc.nextDouble();
        double area = row * col;
        double border = (row + col) * 2;
        System.out.printf("면적: %f\n둘레: %f\n", area, border);
    }
}
