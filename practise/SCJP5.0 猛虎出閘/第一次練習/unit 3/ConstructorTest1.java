class Constructor1
{
 public Constructor1()
 {
  System.out.println("我是Constructor1");
 }
}

public class ConstructorTest1 extends Constructor1
{
 public ConstructorTest1(int i)
 {
  System.out.println("i的數值= "+i);
 }
 public static void main(String argv[])
 {
  new ConstructorTest1(1);
 }
}
