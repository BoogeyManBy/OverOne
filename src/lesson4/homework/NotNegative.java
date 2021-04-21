package lesson4.homework;

/**
 * Создайте программу, выводящую на экран
 * все неотрицательные элементы последовательности
 * 90 85 80 75 70 65 60 55 ….
 */
public class NotNegative {
    public static void main(String[] args) {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }
}
