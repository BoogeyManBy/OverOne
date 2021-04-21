package dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Пупс";
        dog.breed = "Пудель";
        dog.speed = 0;
        dog.run();
        System.out.println(dog.info());
    }
}
