import java.util.Objects;

public class SportsClub {
    private String clubName;
    private String city;
    private Sport sport;

    public SportsClub(String clubName, String city, Sport sport) {
        this.clubName = clubName;
        this.city = city;
        this.sport = sport;
    }

    public String getClubName() { return clubName; }
    public String getCity() { return city; }
    public Sport getSport() { return sport; }

    public void setClubName(String clubName) { this.clubName = clubName; }
    public void setCity(String city) { this.city = city; }
    public void setSport(Sport sport) { this.sport = sport; }

    public void displayInfo() {
        System.out.println("Клуб: " + clubName);
        System.out.println("Қала: " + city);
        sport.showinfo();
    }


    @Override
    public String toString() {
        return "SportsClub{clubName='" + clubName +
                "', city='" + city +
                "', sport=" + sport + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportsClub)) return false;
        SportsClub club = (SportsClub) o;
        return Objects.equals(clubName, club.clubName) &&
                Objects.equals(city, club.city) &&
                Objects.equals(sport, club.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName, city, sport);
    }
}