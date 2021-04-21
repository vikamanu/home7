package lesson6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Тимка");
        Dog dog = new Dog("Малыш");

        System.out.println(Animal.getAnimalCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
        cat.run(30);
        dog.run(60);
        dog.swim(15);
        cat.swim(10);
    }
}
