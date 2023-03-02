package Seminar6;

public class Cat {

    private String name;
    public int appetite;
    private int satiety;
    
    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite, satiety);
    }

    @Override
    public String toString() {
        return name + "{appetite=" + appetite + ", satiety=" + satiety + "}";
    }
}
