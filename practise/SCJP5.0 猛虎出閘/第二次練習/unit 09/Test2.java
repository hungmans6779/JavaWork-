public class Test2
{
 public static void main(String argv[])
 {
  Integer ii1=new Integer(100);
  Integer ii2=Integer.valueOf(200);
  int i1=ii1.intValue();
  int i2=ii2.intValue();
  System.out.println("i1="+i1);
  System.out.println("i2="+i2);
  
  Integer ii3=100;
  int i3=ii3;
  System.out.println("i3="+i3);
 }
}