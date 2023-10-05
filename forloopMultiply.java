//Program on multiplication table using forloop

import java.util.*;
class forloopMultiply
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter number for table");
      n=sc.nextInt();
      for(int i=1;i<=10;i++)
        {
          System.out.println(n+"*"+i+"="+(n*i));
        }
    }
  }