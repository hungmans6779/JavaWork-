public class ObjectTest1
{
 public static void main(String argv[])
 {
  Sub sub=new Sub();
  System.out.println("sub.i = "+sub.i);
  System.out.println("sub.j = "+sub.j);
  Super sub1=(Super)sub;
  System.out.println("sub1.i = "+sub1.i);
  //System.out.println("sub1.j = "+sub1.j);
 }
}

class Super
{
 int i=10;
}

class Sub extends Super
{
 int j=20;	
}