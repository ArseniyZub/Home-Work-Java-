package OOP.Seminar4;

public class Fruit {
    private final int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "weight=" + weight;
    }

}
