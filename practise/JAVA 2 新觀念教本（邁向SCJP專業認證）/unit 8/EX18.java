public class EX18
{
 public static void main(String argv[])
 {
  Super c1=new Super();
  Sub c2=new Sub();
  System.out.println("c1的面積為 = "+c1.getArea());
  System.out.println("c2的面積為 = "+c2.getArea());
 }
}

class Super
{
 double r=1;
 double getPI()
 {
  return 3.14;
 }
 double getArea()
 {
  return this.getPI()*r*r;
 }
}

class Sub extends Super
{
 double r=10;
 double getPI()
 {
  return 3.1415926;
 }
}