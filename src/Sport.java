import java.util.Objects;

public class Sport {
    private String name;
    private int playernumber;

    public Sport(String name, int playernumber) {
        this.name = name;
        this.playernumber = playernumber;
    }

    public String getName() { return name; }
    public int getPlayernumber() { return playernumber; }

    public void setName(String name) { this.name = name; }
    public void setPlayernumber(int playernumber) { this.playernumber = playernumber; }

    public void showinfo() {
        System.out.println(
                "Спорт: " + name +
                        "\nОйыншы саны: " + playernumber
        );
    }


    @Override
    public String toString() {
        return "Sport{name='" + name + "', playernumber=" + playernumber + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport)) return false;
        Sport sport = (Sport) o;
        return playernumber == sport.playernumber &&
                Objects.equals(name, sport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, playernumber);
    }
}