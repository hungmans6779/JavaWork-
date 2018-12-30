public class AutoBoxingTest2
{
 static Integer x;
 public static void main(String argv[])
 {
  AutoBoxingTest2 a=new AutoBoxingTest2();
  a.go(x);
 }
 void go(Integer i)
 {
  int z=3;
  System.out.println(x+z);
 }
}