import java.util.Objects;

public class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPosition(String position) { this.position = position; }

    public void displayInfo() {
        System.out.println(
                "Ойыншы аты: " + name +
                        "\nЖасы: " + age +
                        "\nПозициясы: " + position
        );
    }



    @Override
    public String toString() {
        return "Player{name='" + name + "', age=" + age + ", position='" + position + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return age == player.age &&
                Objects.equals(name, player.name) &&
                Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position);
    }
}