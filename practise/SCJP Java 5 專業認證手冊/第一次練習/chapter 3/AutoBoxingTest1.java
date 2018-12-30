public class AutoBoxingTest1
{
 public static void main(String argv[])
 {
  Integer i=new Integer(2);
  int y=i.intValue();
  y++;
  Integer x=new Integer(y);
  System.out.println("x="+x);
 }
}