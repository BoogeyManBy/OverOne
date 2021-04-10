package lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int b;
        System.out.print("Введите любое чило в пределах разумного :-) : ");
        b = vvod.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;
        System.out.print(f1 + " " + f2 + " ");
        while (f3 < b) {
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }

    }
}

