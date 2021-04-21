package lesson6;

public class Dog extends Animal{
    private static int dogCount = 0;
    public Dog(String name) {
        super(name);
        runLimit = (int) (20 + Math.random() * 200);
        swimLimit = (int) (5 + Math.random() * 50);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit){
            System.out.println("Собака" + getName() + "пробежал"
                    + distance + "м.");
        } else {
            System.out.println("Собака" + getName() + "не может cтолько пробежать");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= runLimit){
            System.out.println("Собака" + getName() + "проплыл"
                    + distance + "м.");
        } else {
            System.out.println("Собака" + getName() + "не может долго плыть");
        }

    }

    public static int getDogCount() {
        return dogCount;
    }
}
