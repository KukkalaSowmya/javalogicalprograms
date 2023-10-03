/*WAP to display greeting message based on time 
(24 hr format)
  conditions:
1. if time between 5 to lessthan 12 - "Good Morning"
2. if time between 12 to lessthan 16 - "Good Afternoon"
3. if time between 16 to lessthan 20 - "Good evening"
4. else - "Good Night"
*/
class Greetings
  {
    public static void main(String args[])
    {
      int time = 14;
      if(time>=5&&time<12)
      {
        System.out.println("Good Morning");
      }
      else if(time>=12&&time<=16)
      {
        System.out.println("Good Afternoon");
      }
        else if(time>=16&&time<=20)
        {
          System.out.println("Good evening");
        }
      else
        {
          System.out.println("Good night");
        }
    }
  }