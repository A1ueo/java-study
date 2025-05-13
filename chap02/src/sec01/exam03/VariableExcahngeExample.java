package sec01.exam03;

public class VariableExcahngeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.printf("x: %d, y: %d\n", x, y);

        // y = x; // x에 저장된 값을 변수 y에 저장(복사)
        // System.out.printf("x: %d, y: %d\n", x, y);

        // x와 y의 값을 서로 교환. 즉, 바꾸고 싶다면
        int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
