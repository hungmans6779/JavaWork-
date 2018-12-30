public class ExtendsTest2
{
 public static void main(String argv[])
 {
  Super a=new Super();
  a.i=10;
  System.out.println(Super.i);
  System.out.println(a.i);
 }
}

class Super
{
 static int i=5;
}
