//Programmer: David Kopp
//Comp110/110L Sections #14492 / # 14493 

   public class CSUNStudent extends Human {
   
      private int idNumber;
      private String major;
   
      public CSUNStudent() {
         super();
      
         idNumber = 111111;
         major = "Undeclared";
      
      }
   
      public CSUNStudent(String name, double age, double height, int newIdNumber, String newMajor) {
         super(name, age, height);
			
         setIdNumber(newIdNumber);
         setMajor(newMajor);
      
      }
   
      public int getIdNumber() {
         return idNumber;
      
      }
   
      public String getMajor() {
         return major;
      
      }
   
      public void setIdNumber(int newIdNumber) {
         if (newIdNumber > 0 && newIdNumber <= 999999) {
            idNumber = newIdNumber;
         
         }
      }
   
      public void setMajor(String newMajor) {
         if (newMajor.length() > 0) {
            major = newMajor;
         
         }
      }
   
      public void introduction() {
         System.out.println("Hello, my name is " + getName() + ".");
         System.out.println("My CSUN ID is " + idNumber + ".");
         System.out.println("I am " + getAge() + " years old and " + getHeight() + " feet tall.");
         System.out.println("I am majoring in " + major + ".");
         System.out.println();
      
      }
   
   }