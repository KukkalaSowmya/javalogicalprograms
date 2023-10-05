//Program on sum of n natural numbers using whileloop

import java.util.*;
public class whileSumofn
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,sum=0; //10
      System.out.println("enter n value");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          sum=sum+i; //sum=0+1=1
          i++; //2
        }
        System.out.println(sum);
    }
  }