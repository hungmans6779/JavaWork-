public class SwitchTest3
{
 public static void main(String rgv[])
 {
  int x=5;
  switch(x)
  {
   case 1:
    System.out.println("x=1");
   default:
    System.out.println("無解");
   case 2:
    System.out.println("x=2");
    break;
   case 3:
    System.out.println("x=3");
    break;
   //default:
   //  System.out.println("x<0或者x>2");
   // break;
  }
 }
}