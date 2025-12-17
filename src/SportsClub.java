public class SportsClub {
    private String clubName;
    private String city;
    private Sport sport;

    public SportsClub(String clubName, String city, Sport sport) {
        this.clubName = clubName;
        this.city = city;
        this.sport = sport;
    }

    public String getClubName() {
        return clubName;
    }

    public String getCity() {
        return city;
    }

    public Sport getSport() {
        return sport;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void displayInfo() {
        System.out.println("Клуб: " + clubName);
        System.out.println("Қала: " + city);
        sport.showinfo();
    }
}