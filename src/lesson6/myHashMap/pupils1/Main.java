package lesson6.myHashMap.pupils1;

import java.util.ArrayList;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить
 * случайными оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Main {
    public static void main(String[] args) {

        int neud = 3;
        int otl = 10;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < otl; i++) {
            Integer b = (int)(Math.random()*10+1);
            mark.add(i, b);
        }
        System.out.println(mark);
        mark.removeIf(integer -> integer <= neud);
        System.out.println(mark);
    }
}

