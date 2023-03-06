package OOP.Seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        // Player player1 = new Swordsman("Jack");
        // Player player2 = new Archer("Tomas");
        // Player player3 = new Magician("Bill");

        String[] names = {"Гавриил", "Борис", "Олег", "Томас", "Чарли", "Эльдар", "Игорь", "Константин", "Глеб", "Артем"};

 
        int allPlayers = 10;
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < allPlayers; i++) {
            int idx = new Random().nextInt(names.length);
            String randomName = (names[idx]);

            if (r.nextInt(2) == 0) {
                players.add(new Swordsman(randomName));
            } else if (r.nextInt(2) == 1) {
                players.add(new Archer(randomName));
            } else {
                players.add(new Magician(randomName));
            }
            System.out.println(players.get(i));
        }

        for (int i = 0; allPlayers > 1; i++) {
            players.get(i).Attack(players.get(r.nextInt(allPlayers))); // каждый сам за себя, даже если бьет себя :)

            if (!players.get(i).life) {
                players.remove(i);
                allPlayers--;
            }
            if(i == players.size() - 1) {
                i = 0;
            }
        }

        System.out.println("Победитель: \n" + players); // так и не понял почему id=11
        
        // System.out.println(player1);
        // System.out.println(player2);
        // System.out.println(player3);

        // player1.Attack(player3);
        // System.out.println(player3);
    }
    
}
