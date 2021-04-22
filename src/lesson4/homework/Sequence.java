package lesson4.homework;

/**
 * Выведите на экран все члены последовательности 2an-1–1,
 * где a1=2, которые меньше 10000.
 * A1 = 2, получается А2 = 2 * (2 - 1) - 1
 */
public class Sequence {
    public static void main(String[] args) {
        for (int a = 4; a < 10000; a=2*a-1-1) {
            System.out.println(a);
        }
    }
}
