/* Author: Caitlyn Smith
   Course: CISS 111-300
   Email: c-smith54@hvcc.edu

   Program Description:
   This program tests superclasses and subclasses, objects,
   unique methods, and override methods including toString(). */

public class Main {
    public static void main(String[] args) {
        // Football objects
        Football noSaints = new Football("Jameis Winston",4,"Dennis Allen","football","New Orleans Saints",16,53,true);
        Football lsuTigers = new Football("Jayden Daniels",4,"Brian Kelly","football","LSU Tigers",16,53,false);

        // Hockey objects
        Hockey letterkennyIrish = new Hockey("Clark Colosimo",3,"Coach","hockey","Letterkenny Irish",12,10,false);
        Hockey phillyFlyers = new Hockey("Martin Jones",3,"John Tortorella","hockey","Philadelphia Flyers",19,10,true);

        // Testing toString method from superclass Sports
        System.out.println(noSaints);
        System.out.println("");

        // Testing override methods
        noSaints.letsGo();
        phillyFlyers.letsGo();
        System.out.println("");

        // Testing unique Football method
        lsuTigers.cheer();
        noSaints.cheer();
        System.out.println("");

        // Testing unique Hockey method
        phillyFlyers.printGoalie();
        letterkennyIrish.printGoalie();
        System.out.println("");

        // Testing interfaces
        // Equipment interface on both Football and Hockey classes
        // Informs what needs to be restocked per sport/team
        lsuTigers.restock();
        phillyFlyers.restock();

        // Season interface on Football class
        // Defines the season for each team/league
        lsuTigers.seasonDuration();
        noSaints.seasonDuration();

        // Division interface on Football class
        // Defines which division each team is in
        lsuTigers.teamDivision();
        noSaints.teamDivision();

        System.out.println("");

        // Printing out various values
        System.out.println("Who is the " + noSaints.getTeamName() + " quarterback? " + noSaints.quarterback);
        System.out.println("What team do Baton Rouge natives root for? " + lsuTigers.getTeamName());
        System.out.println("Are the " + phillyFlyers.getTeamName() + " major? " + phillyFlyers.getProSport());
        System.out.println("What sport do the " + letterkennyIrish.getTeamName() + " play? " + letterkennyIrish.getSportType());
    }
}
