 //Java program to Check whether the number is even or odd using switch case
   public class SwitchCase
     {
       public static void main(String args[])
       {
         //Declaring that a person is eligible to vote.
         int age=21;
         //Dividing age by 2 to limit no. of cases
           age=age/2;
         //Enclosing age in switch expressions to check against matching case

         switch(age)
           {
               //More than one case may be written together if the under-statement is common
             case 0:
               System.out.println("Eligible for voting");
               break;

             case 1:
               System.out.println("Not Eligible for voting");
               break;
           }
         
       }
     }