public class EX5
{
 public static void main(String argv[])
 {
  Sub b=new Sub();
  System.out.println("b.i = "+b.i);
  System.out.println("b.j = "+b.j);
  System.out.println("b.getJ1() = "+b.getJ1());
  System.out.println("b.getJ2() = "+b.getJ2());
 }
}

class Super 
{
 static int i=1;
 int j=2;
 int getJ1()
 {
  return j;
 }
}

class Sub extends Super
{
 float i=10;
 int j=20;
 int getJ2()
 {
  return j;
 }

}