package lesson7;

public class Cat {
    private final String name;
    private boolean hungry;
    private final int appetite;

    public Cat(String name) {
        appetite = (int) (1 + Math.random() * 50);
        hungry = true;
        this.name = name;
    }

    public void eat(Plate plate){
        if (hungry) {
            if (plate.getFood() >= appetite) {
                hungry = false;
                plate.consumeFood(appetite);
                System.out.println("Кот" + name + " съел" + appetite + "" + " единиц еды, он сыт");
            } else {
                System.out.println("Мало еды в тарелке");
                System.out.println("Дайте еды еще!");
            }
        } else {
            System.out.println("не корми! я сыт!");
        }
    }
}
