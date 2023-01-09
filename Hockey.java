// Hockey subclass

public class Hockey extends Sports implements Equipment {
    String goalie;
    int periods;

    public Hockey(String goalie,int periods,String coachName, String sportType, String teamName, double ranking, int roster, boolean proSport) {
        super(coachName,sportType,teamName,ranking,roster,proSport);
        this.goalie = goalie;
        this.periods = periods;
    }

    public String printGoalie() {
        if (getTeamName() == "Letterkenny Irish") {
            System.out.println(goalie);
        } else if (getTeamName() == "Philadelphia Flyers") {
            System.out.println(goalie);
        }
        return "true";
    }

    // Subclass override method
    void letsGo() {
        System.out.println("Let's talk about hockey!");
    }

    // toString override method
    @Override
    public String toString() {
        return goalie + ", " + periods + ", " + getCoachName() + ", " + getSportType() + ", "
                + getTeamName() + ", " + getRanking() + ", " + getRoster() + ", " + getProSport();
    }

    @Override
    public void restock() {
        System.out.println("Restock sticks, pucks, and skates");
    }
}
