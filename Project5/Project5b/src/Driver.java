/**
* Project #5: Extra Credit - Classes and Objects
* File: Driver.java
* Section #14492
* Programmer: David Kopp
* Date: 4/17/13
* Description: This program is a driver program that uses a jar library of 3 classes. 
* It will create 3 different objects and display the data that corresponds to those objects.
*/
   import java.util.Scanner;

   public class Driver {
      public static void main(String[] args) {
      
         Scanner input = new Scanner(System.in);
      
      // Book Object user input 
         System.out.print("Please enter the title of the book: ");
         String newBookTitle = input.nextLine();
         System.out.print("Please enter the author of the book: ");
         String newBookAuthor = input.nextLine();
         System.out.print("Please enter the number of pages in the book: ");
         int newBookPages = input.nextInt();
         input.nextLine();
      	
      // Person Object user input     
         System.out.print("\nPlease enter a person's name: ");
         String newPersonName = input.nextLine();
         System.out.print("Please enter the person's height in inches: ");
         double newPersonHeight = input.nextDouble();
         System.out.print("Please enter the person's Weight in pounds: ");
         double newPersonWeight = input.nextDouble();
         input.nextLine();
      
      // Hockey Object user input
         System.out.print("\nPlease enter a NHL team name: ");
         String newHockeyTeam = input.nextLine();
         System.out.print("Please enter the number of wins that team won: ");
         int newHockeyWins = input.nextInt();
         System.out.print("Please enter the number of goals that the team scored: ");
         int newHockeyGoals = input.nextInt();
      
      // Book Object       
         Book book1 = new Book(newBookTitle, newBookAuthor, newBookPages);
      
      // Person Object
         Person person1 = new Person(newPersonName, newPersonHeight, newPersonWeight);
      
      // Hockey Object
         Hockey hockey1 = new Hockey(newHockeyTeam, newHockeyWins, newHockeyGoals);
      
      // toString output for user via console      
         System.out.println(book1.toString());
         System.out.println(person1.toString());
         System.out.println(hockey1.toString());      
      
      }
   }