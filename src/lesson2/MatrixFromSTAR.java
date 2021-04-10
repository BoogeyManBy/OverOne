package lesson2;

import java.util.Scanner;

public class MatrixFromSTAR {
    public static void main(String[] args) {
        Scanner vvodA = new Scanner(System.in);
        int ab;
        System.out.print("Введите значение а: ");
        ab = vvodA.nextInt();
        Scanner vvodB = new Scanner(System.in);
        int ba;
        System.out.print("Введите значение b: ");
        ba = vvodB.nextInt();
        for (int a = 0; a < ab; a++) {
            for (int b = 0; b < ba; b++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}