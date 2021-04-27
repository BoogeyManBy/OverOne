package lesson4.homework;

/**
 * Выведите на экран все двузначныее члены
 * последовательности 2an-1+200, где a1= –166.
 */
public class Sequence2 {
    public static void main(String[] args) {
        for (int a = -166; a < 100; a=2*a-1+200) {
            System.out.println(a);
        }
    }
}
