public class IntToStringTest1
{
 public static void main(String argv[])
 {
  int x=100;
  int y=200;
  System.out.println("x + y = "+(x+y));
  String new_x=Integer.toString(x);
  String new_y=Integer.toString(y);
  System.out.println("new_x + new_y = "+(new_x+new_y));
 }
}