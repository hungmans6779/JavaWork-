class Test1
{
 static int i=10;
 int j=10;
}

public class StaticTest1
{
 public static void main(String argv[])
 {
  Test1 t=new Test1();
  System.out.println(Test1.i);
  System.out.println(t.i);
  System.out.println(t.j);
 }
} 