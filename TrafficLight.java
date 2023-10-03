/*Traffic Light Example
conditions:
  1. if the color is green - "Go"
  2. if the color is red - "stop"
  3. if the color is orange - "ready to go"
  */
class TrafficLight
  {
    public static void main(String args[])
    {
      String color = "red";
      if(color.equals("green"))
      {
        System.out.println("Go");
      }
      else if(color.equals("red"))
      {
        System.out.println("Stop");
      }
      else if(color.equals("orange"))
      {
        System.out.println("Ready to go");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
  }
  