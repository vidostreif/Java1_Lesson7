package vido.geekbrains;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println("Котик накушался!");
            this.satiety = true;
        } else {
            System.out.println("Котик не накушался!");
            this.satiety = false;
        }
    }
}