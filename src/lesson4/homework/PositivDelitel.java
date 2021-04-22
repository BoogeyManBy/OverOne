package lesson4.homework;

import java.util.Scanner;

public class PositivDelitel {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
            System.out.print("Делителями вашего числа " + a + " являются: ");
            for (int i = a; i > 0 ; i--) {
                int b = a%i;
                if(b==0){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.println("Вы ввели не верное значение!");
        }
    }
}
