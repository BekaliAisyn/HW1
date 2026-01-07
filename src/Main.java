import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ойыншының атын жаз: ");
        String name = scanner.nextLine();

        System.out.print("Ойыншының жасын жаз: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        Player player = new Player(name, age, "Шабуылшы");

        System.out.println("\nОйыншы туралы ақпарат:");
        player.displayInfo();


        ArrayList<Player> players = new ArrayList<>();

        players.add(player);
        players.add(new Player("Дастан Сатпаев", 17, "Шабуылшы"));
        players.add(new Player("Темірлан Анарбеков", 22, "Қақпашы"));

        Sport football = new Sport("Футбол", 11);
        SportsClub club = new SportsClub("Aтырау FC", "Атырау", football);

        System.out.println("\nКлуб туралы ақпарат:");
        club.displayInfo();

        System.out.println("\nБарлық ойыншылар:");
        for (Player p : players) {
            p.displayInfo();
        }


        Player found = searchPlayerByName(players, "Дастан Сатпаев");
        System.out.println("\nІздеу нәтижесі:");
        if (found != null) {
            found.displayInfo();
        }


        System.out.println("\n18 жастан үлкен ойыншылар:");
        ArrayList<Player> adults = filterPlayersByAge(players, 18);
        for (Player p : adults) {
            p.displayInfo();
        }


        sortPlayersByAge(players);
        System.out.println("\nЖасы бойынша сұрыпталған ойыншылар:");
        for (Player p : players) {
            p.displayInfo();
        }

        scanner.close();
    }


    static Player searchPlayerByName(ArrayList<Player> players, String name) {
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }


    static ArrayList<Player> filterPlayersByAge(ArrayList<Player> players, int minAge) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player p : players) {
            if (p.getAge() >= minAge) {
                result.add(p);
            }
        }
        return result;
    }


    static void sortPlayersByAge(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            for (int j = i + 1; j < players.size(); j++) {
                if (players.get(i).getAge() > players.get(j).getAge()) {
                    Player temp = players.get(i);
                    players.set(i, players.get(j));
                    players.set(j, temp);
                }
            }
        }
    }
}