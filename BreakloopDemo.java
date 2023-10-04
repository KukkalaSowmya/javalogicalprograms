//Java program to demonstrate break in loops

public class BreakloopDemo
  {
    public static void main (String args[])
    {
      //Running for loop from 0 to 9
      for(int i=0; i<10; i++)
        {
          //Checking the condition if i=5
          if (i==5)
          {
          //Break the condition when the condition is true
            break;
        }
      //printing the values till 4
      System.out.println(i);
        }   
    }
  }