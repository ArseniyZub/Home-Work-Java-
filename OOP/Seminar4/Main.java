package OOP.Seminar4;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); 
        Box<Orange> orangeBox = new Box<>(); 
        Box<GoldenApple> goldenAppleBox = new Box<>(); 


        appleBox.add(new Apple(10));
        appleBox.add(new GoldenApple(20));
        appleBox.add(new GoldenApple(30));

        goldenAppleBox.add(new GoldenApple(40));
        goldenAppleBox.add(new GoldenApple(20));
        goldenAppleBox.add(new GoldenApple(30));

        for (int i = 0; i < appleBox.size(); i++) {
            System.out.println(appleBox.get(i));
        }

        System.out.println("\n");

        for (int i = 0; i < goldenAppleBox.size(); i++) {
            System.out.println(goldenAppleBox.get(i));
        }

        System.out.println("\n");

        System.out.println(appleBox.getWeight());
        goldenAppleBox.moveTo(appleBox);
        System.out.println(appleBox.getWeight());

    }
}
