package lesson4.homework;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        int a;
        long b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натурально число: ");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
            for (int i = a; i > 0; i--) {
                b = b * i;
            }
            System.out.println("Факториал числа " +a+ " = " + b);
        }
        else {
            System.out.println("Вы ввелине верное значение.");
        }
    }
}
