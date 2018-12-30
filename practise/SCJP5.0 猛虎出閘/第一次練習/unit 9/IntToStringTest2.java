public class IntToStringTest2
{
 public static void main(String argv[])
 {
  int x=100;
  int y=200;
  System.out.println("x + y = "+(x+y));
  String new_x=String.valueOf(x);
  String new_y=String.valueOf(y);
  System.out.println("new_x + new_y = "+(new_x+new_y));
 }
}