public class Test8
{
 public static void main(String argv[])
 {
  Integer y=567;
  Integer x;
  x=y;
  System.out.println(x==y);
  y++;
  System.out.println(x+" "+y);
  System.out.println(x==y);
 }
}