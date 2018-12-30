public class AutoBoxingTest1_2
{
 public static void main(String argv[])
 {
  Integer y=new Integer(2);
  Integer x=y;
  System.out.println("x==y : "+(x==y));
  y++;
  System.out.println(x+" "+y);
  System.out.println("x==y : "+(x==y));
 }
}