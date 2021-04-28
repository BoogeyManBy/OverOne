package lesson6.myHashMap.pupils1;

import java.util.ArrayList;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить
 * случайными оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> mark = new ArrayList<>();
        mark.add(3);
        mark.add(6);
        mark.add(8);
        mark.add(2);
        mark.add(5);
        mark.add(1);
        mark.add(10);
        System.out.println(mark);
        mark.remove(0);
        mark.remove(2);
        mark.remove(3);
        System.out.println(mark);
    }
}

