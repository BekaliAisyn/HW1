public class Sport {
    private String name;
    private int playernumber;

    public Sport(String name, int playernumber) {
        this.name = name;
        this.playernumber = playernumber;
    }

    public String getName() {
        return name;
    }

    public int getPlayernumber() {
        return playernumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayernumber(int playernumber) {
        this.playernumber = playernumber;
    }
    public void showinfo() {
        System.out.println("Спорт: " + name + "\nОйыншы Саны: " + playernumber);
    }
}