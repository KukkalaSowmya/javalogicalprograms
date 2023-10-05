//Write a program to print all odd numbers 1 to 100 using 'continue'

public class OddNo
  {
    public static void main(String args[])
    {
      int number=100;
      System.out.println("List of odd numbers from +number+");
      for(int i=1;i<100;i++)
        {
          //Check the logic if number is odd or not
          //if i%2 is not eaual to zero the number is odd

          if(i%2!=0)
            System.out.print(i+"");
        }
    }
  }