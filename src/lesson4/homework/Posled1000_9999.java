package lesson4.homework;

public class Posled1000_9999 {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i+=3) {
            if (i>9999) {
                break;
            }
            System.out.println(i);
        }
    }
}
