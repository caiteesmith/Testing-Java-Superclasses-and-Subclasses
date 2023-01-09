// Sports Superclass

public class Sports {
    private final String coachName;
    private final String sportType;
    private final String teamName;
    private final double ranking;
    private final int roster;
    private final boolean proSport;

    public Sports(String coachName, String sportType, String teamName, double ranking, int roster, boolean proSport) {
        this.coachName = coachName;
        this.sportType = sportType;
        this.teamName = teamName;
        this.ranking = ranking;
        this.roster = roster;
        this.proSport = proSport;
    }

    // Getters
    public String getCoachName() {
        return coachName;
    }

    public String getSportType() {
        return sportType;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getRanking() {
        return ranking;
    }

    public int getRoster() {
        return roster;
    }

    public boolean getProSport() {
        return proSport;
    }

    // Additional override method
    // Football and Hockey subclasses can override
    void letsGo() {
        System.out.println("Let's talk about sports!");
    }

    // toString override method
    @Override
    public String toString() {
        return coachName + ", " + sportType + ", " + teamName + ", " + ranking + ", " + roster + ", " + proSport;
    }
}