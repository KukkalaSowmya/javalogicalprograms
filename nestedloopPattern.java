//Java program on pattern using nested loop

public class nestedloopPattern
  {
    public static void main(String args[])
    {
      //Declaring loop variables
      int rows = 5;
      
      //outer loop
      for(int i=1; i<=rows; ++i)
        {
        //inner loop 
          for(int k=1; k<=i; ++k)
            {
              System.out.println(k + " ");
            }
          System.out.println(" ");
        }
    }
  }