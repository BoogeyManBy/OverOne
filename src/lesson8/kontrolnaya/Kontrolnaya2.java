package lesson8.kontrolnaya;

import java.util.Random;

public class Kontrolnaya2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = r.nextInt(10);
            System.out.print(massive[i] + " ");
        }
        int maxCounter = 0, max = 0;
        for (int j : massive) {
            int counter = 0;
            for (int k : massive) {
                if (k == j) {
                    counter++;
                }
            }
            if (counter>maxCounter) {
                maxCounter = counter;
                max=j;
            }
        }
        System.out.println("\nМаксимум" + " " + max);
    }
}
