public class StringToIntTest2
{
 public static void main(String argv[])
 {
  String x="100";
  String y="200";
  System.out.println("x + y = "+(x+y));
  int new_x=Integer.valueOf(x).intValue();
  int new_y=Integer.valueOf(y).intValue();
  System.out.println("new_x + new_y = "+(new_x+new_y)); 
 }
}