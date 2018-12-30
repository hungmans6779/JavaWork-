public class StringToIntTest1
{
 public static void main(String argv[])
 {
  String x="100";
  String y="200";
  System.out.println("x + y = "+(x+y));
  int new_x=Integer.parseInt(x);
  int new_y=Integer.parseInt(y);
  System.out.println("new_x + new_y = "+(new_x+new_y)); 
 }
}