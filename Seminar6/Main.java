package Seminar6;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Plate plate = new Plate(20);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Томас", 15, 5);
        cats[1] = new Cat("Мурзик", 11, 7);
        cats[2] = new Cat("Филлип", 14, 6);
        cats[3] = new Cat("Барсик", 17, 4);
        cats[4] = new Cat("Саймон", 16, 5);

        for (int i = 0; i < cats.length; i++) {
            
            if (cats[i].appetite < plate.food) {
                cats[i].eat(plate);
    
                System.out.println(plate);
                System.out.println(cats[i] + " -> поел");
            } else {
                plate.increaseFood(cats[i].appetite);
            }
            Thread.sleep(1000);
            
        }
    }
}
