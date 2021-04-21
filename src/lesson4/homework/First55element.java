package lesson4.homework;

/**
 * Создайте программу, выводящую на экран
 * первые 55 элементов последовательности
 * 1 3 5 7 9 11 13 15 17 ….
 */
public class First55element {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(a);
            a += 2;
        }
    }
}
