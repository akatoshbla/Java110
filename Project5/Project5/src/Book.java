/**
* Project #5: Classes and Objects
* File: Book.java
* Section #14492
* Programmer: David Kopp
* Date: 4/15/13
* Description: This program is a class called Book with 3 global variables, 2 constructors, 
* 3 get methods, 3 set methods, and a toString method.
*/

   import java.util.Scanner;

   public class Book {
      private String title;
      private String author;
      private int pages;
   
		// Constructor one
      public Book() {
      
         title = "Java for Dummies";
         author = "David Kopp";
         pages = 1;
      
      }
		
		// Constructor two
      public Book(String newTitle, String newAuthor, int newPages) {
      
         setTitle(newTitle);
         setAuthor(newAuthor);
         setPages(newPages);
      
      }
   
		// Three getter methods
      public String getTitle() {
         return title;
      }
      public String getAuthor() {
         return author;
      }
      public int getPages() {
         return pages;
      }
   
		// Three setter methods
      public void setTitle(String newTitle) {
         if (newTitle.length() > 0 && newTitle.length() <= 100) {
            title = newTitle;
         } 
         else {
            System.out.println("I am sorry, but the book's title " + newTitle + " is too many characters.(The max amount of characters a book's title could be is 100.)");
         }
      
      }
      public void setAuthor(String newAuthor) {
         if (newAuthor.length() > 0 && newAuthor.length() <= 100) {
            author = newAuthor;
         }
         else {
            System.out.println("I am sorry, but the author's name " + newAuthor + " is too many characters.(The max amount of characters a author's name could be is 100.)");
         }
      
      }
      public void setPages(int newPages) {
         if (newPages > 0 && newPages <= 1000) {
            pages = newPages;
         }
         else {
            System.out.println("I am sorry, but the number of pages entered " + newPages + " is incorrect.(The accepted Range of pages that a book could have is 0 through 1000.)");
         }
      
      }
		
		// toString Method
      public String toString() {
         return "\nThe Book's Title is: " + title + " writen by " + author + " and has " + pages + " pages.";
      }
   
		// Driver to test and demonstrate this class by creating an object book1
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      
         System.out.print("Please enter the title of the book: ");
         String newBookTitle = input.nextLine();
         System.out.print("Please enter the author of the book: ");
         String newBookAuthor = input.nextLine();
         System.out.print("Please enter the number of pages in the book: ");
         int newBookPages = input.nextInt();
      
         Book book1 = new Book(newBookTitle, newBookAuthor, newBookPages);
      
         System.out.println(book1.toString());
      
      }
   
   }