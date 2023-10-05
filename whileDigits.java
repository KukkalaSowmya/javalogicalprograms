//Program on find the no. of digits in a given number using while loop

import java.util.*;
public class whileDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,count=0;
      System.out.println("enter the number");
      n=sc.nextInt();
      while(n!=0) //4!=0
        {
          n=n/10; //n=4/10=0
          count++; //3
        }
        System.out.println(count);
          
        }
  }