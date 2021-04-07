package lesson1.homework;

public class MatrixFor10x10 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }
    }
}
