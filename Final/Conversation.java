//Programmer: David Kopp
//Comp110/110L Sections #14492 / # 14493  
	
	public class Conversation {
      public static void main(String[] args) {
      
         CSUNStudent student1 = new CSUNStudent("David Kopp", 34.1, 5.95, 111112, "Computer Science");
         CSUNStudent student2 = new CSUNStudent("Mr. T", 68.9, 6.60, 111113, "Kicking Ass Foo!");
      
         student1.introduction();
         student2.introduction();
      }
   }