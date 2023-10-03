/*WAP to check the person is eligible for blood donation or not
  conditions:
age>=18
weight>=50*/
public class BloodDonation{
  public static void main(String args[])
  {
    int age,weight;
    age=23;
    weight=56;
    if(age>=18&&weight>=50)
    {
      System.out.println("Eligible");
    }
    else
    {
      System.out.println("Not Eligible");
      
    }
  }
}