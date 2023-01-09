// Football subclass
public class Football extends Sports implements Equipment, Season, Division {
    String quarterback;
    int quarters;

    public Football(String quarterback, int quarters, String coachName, String sportType, String teamName, double ranking, int roster, boolean proSport) {
        super(coachName,sportType,teamName,ranking,roster,proSport);
        this.quarterback = quarterback;
        this.quarters = quarters;
    }

    public String cheer() {
        if (getTeamName() == "New Orleans Saints") {
            System.out.println("WHO DAT");
        } else if (getTeamName() == "LSU Tigers") {
            System.out.println("GEAUX TIGERS");
        }
        return "true";
    }

    // Subclass override method
    void letsGo() {
        System.out.println("Let's talk about football!");
    }

    // toString override method
    @Override
    public String toString() {
        return quarterback + ", " + quarters + ", " + getCoachName() + ", " + getSportType() + ", "
                + getTeamName() + ", " + getRanking() + ", " + getRoster() + ", " + getProSport();
    }

    @Override
    public void restock() {
        System.out.println("Restock footballs, cleats, and field marking");
    }

    @Override
    public void seasonDuration() {
        if (getTeamName() == "New Orleans Saints") {
            System.out.println("The 2022 NFL football season starts on September 8, 2022 and ends on February 13, 2023.");
        } else if (getTeamName() == "LSU Tigers") {
            System.out.println("The 2022 NCAA football season starts on August 27, 2022 and ends on December 10, 2022.");
        }
    }

    @Override
    public void teamDivision() {
        if (getTeamName() == "New Orleans Saints") {
            System.out.println("NFC South");
        } else if (getTeamName() == "LSU Tigers") {
            System.out.println("NCAA/SEC");
        }
    }
}