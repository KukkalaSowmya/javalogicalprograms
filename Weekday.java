//Check wheather which day of the week according to their number

  public class Weekday
  {
    public static void main(String args[])
      {
        //Enter the no. in the week
        int day=7;
        String dayString;
        
        //switch statement with int data type
        switch(day)
          {
            case 1:
              dayString="1";
              System.out.println("monday");
              break;
            case 2:
              dayString="2";
               System.out.println("tuesday");
              break;
            case 3:
              dayString="3";
              System.out.println("wednesday");
              break;
            case 4:
              dayString="4";
               System.out.println("thursday");
              break;
            case 5:
              dayString="5";
               System.out.println("friday");
              break;
            case 6:
              dayString="6";
               System.out.println("saturday");
              break;
            case 7:
              dayString="7";
               System.out.println("sunday");
              break;
              default:
              dayString="default day";
               System.out.println("default");
          }
      }
  }