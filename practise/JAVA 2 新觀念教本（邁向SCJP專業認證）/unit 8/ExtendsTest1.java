public class ExtendsTest1
{
 public static void main(String argv[])
 {
  Sub b=new Sub();
 b.i=10;
  System.out.println(Super.i);
  System.out.println(b.i);
 }
}

class Super
{
 static int i=5;
}

class Sub extends Super
{
 int i=10;
}