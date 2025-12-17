import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ойыншының атын жаз: ");
        String name = scanner.nextLine();

        System.out.print("Ойыншының жасын жаз: ");
        int age = scanner.nextInt();

        Player player = new Player(name, age, "Шабуылшы");

        System.out.println("Ойыншы туралы ақпарат:");
        player.displayInfo();

        Sport football = new Sport("Футбол", 11);
        Player player1 = new Player("Дастан Сатпаев", 17, "Шабуылшы");
        Player player2 = new Player("Темірлан Анарбеков", 22, "Қақпашы");

        SportsClub club = new SportsClub("Aтырау FC", "Атырау", football);

        club.displayInfo();
        player1.displayInfo();
        player2.displayInfo();

        if (player1.getAge() > player2.getAge()) {
            System.out.println(player1.getName() + " Жасы үлкен келесі ойыншыдан- " + player2.getName());
        } else {
            System.out.println(player2.getName() + " Жасы үлкен келесі ойыншыдан- " + player1.getName());
        }

        scanner.close();
    }
}
