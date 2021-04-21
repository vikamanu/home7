package lesson7;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(" Тимка");
        cats[1] = new Cat(" Беттер");
        cats[2] = new Cat(" Тай");

        Plate plate = new Plate(200);

        for (Cat cat : cats) {
            cat.eat(plate);

        }
        for (Cat cat : cats) {
            cat.eat(plate);

        }
    }
}
