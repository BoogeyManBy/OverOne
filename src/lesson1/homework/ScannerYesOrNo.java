package lesson1.homework;

import java.util.Scanner;

public class ScannerYesOrNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("2 + 2 = 5 ? - напиши да или нет");
        String string = s.nextLine();
        if (string.equals("да")) {
            System.out.println("Ответ не верен");
        } else if (string.equals("нет")) {
            System.out.println("Вы ввели верный ответ");
        } else {
            System.out.println("Вы ввели не точный ответ");
        }
    }
}
//Не понимаю как правильно считать ответ да или нет для дальнейшего условия.
