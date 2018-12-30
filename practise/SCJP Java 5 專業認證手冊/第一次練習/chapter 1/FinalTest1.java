final class Test
{
 private int i=10;
 int getInt()
 {
  return i;
 }
}

public class FinalTest1
{
 public static void main(String argv[])
 {
  Test t=new Test();
  System.out.println(t.getInt());
 }
}