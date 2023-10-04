//Java program on eligibility to vote according to age
import java.util.Scanner;
public class VotingEligibility
  {
    public static void main(String args[])
    {
    //Declaring age for eligibility
      int age=56;
      //Taking user input
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age");
      age = scan.nextInt();
      //Checking the eligibility for voting
      if(age>=18)
      {
        System.out.println("Eligible for voting");
      }
      else
      {
        System.out.println("Not eligible for voting");
      }
      
    }
  }
  