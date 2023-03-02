package Seminar6;

public class Plate {
    
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int foodToDecrease, int satiety) {
        food = food - (foodToDecrease - satiety);
    }

    public void increaseFood(int foodToDecrease) {
        food = food + foodToDecrease;
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }
}

