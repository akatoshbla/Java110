/**
* Project #5: Classes and Objects
* File: Hockey.java
* Section #14492
* Programmer: David Kopp
* Date: 4/15/13
* Description: This program is a class called Hockey with 3 global variables, 2 constructors, 
* 3 get methods, 3 set methods, and a toString method.
*/

   import java.util.Scanner;

   public class Hockey {
      private String team;
      private int wins;
      private int goals;
   
		// Constructor one
      public Hockey() {
      
         team = "Kings";
         wins = 0;
         goals = 0;
      
      }
		
		// Constructor two
      public Hockey(String newTeam, int newWins, int newGoals) {
      
         setTeam(newTeam);
         setWins(newWins);
         setGoals(newGoals);
      
      }
		
      // Three getter methods
      public String getTeam() {
         return team;
      }
      public int getWins() {
         return wins;
      }
      public int getGoals() {
         return goals;
      }
   
		// Three setting methods
      public void setTeam(String newTeam) {
         if (newTeam.length() > 0 && newTeam.length() <= 26) {
            team = newTeam;
         } 
         else {
            System.out.println("I am sorry, but the team name " + newTeam + " is too many characters.(The max amount of characters a team name could be is 26.)");
         }
      
      }
      public void setWins(int newWins) {
         if (newWins >= 0 && newWins <= 86) {
            wins = newWins;
         }
         else {
            System.out.println("I am sorry, but the number of " + newWins + " wins you have entered is incorrect.(Range of wins is 0 through 86.)");
         }
      
      }
      public void setGoals(int newGoals) {
         if (newGoals >= 0 && newGoals <= 1000) {
            goals = newGoals;
         }
         else {
            System.out.println("I am sorry, but the number of " + newGoals + " goals scored you have entered is incorrect.(Range of losses is 0 through 1000.)");
         }
      
      }
		
		// ToString Method
      public String toString() {
         return "\nThe NHL team: " + team + " won " + wins + " games and scored " + goals + " goals.";
      }
   
		// Driver to test and demonstrate this class by creating an object hockey1
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      
         System.out.print("Please enter a NHL team name: ");
         String newHockeyTeam = input.nextLine();
         System.out.print("Please enter the number of wins that team won: ");
         int newHockeyWins = input.nextInt();
         System.out.print("Please enter the number of goals that team scored: ");
         int newHockeyGoals = input.nextInt();
      
         Hockey hockey1 = new Hockey(newHockeyTeam, newHockeyWins, newHockeyGoals);
      
         System.out.println(hockey1.toString());
      
      }
   
   }