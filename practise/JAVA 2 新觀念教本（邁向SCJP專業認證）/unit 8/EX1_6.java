class Super
{
 void m(int a)
 {
  System.out.println("一就是一");
 }
}

public class EX1_6 extends Super
{
 public static void main(String argv[])
 {
  Super s=new EX1_6();
  s.m(6);
 }
 public void m(int a)
 {
  System.out.println("二就是二");
 }
}