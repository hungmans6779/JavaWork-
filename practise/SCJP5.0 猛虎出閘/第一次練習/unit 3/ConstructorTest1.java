class Constructor1
{
 public Constructor1()
 {
  System.out.println("�ڬOConstructor1");
 }
}

public class ConstructorTest1 extends Constructor1
{
 public ConstructorTest1(int i)
 {
  System.out.println("i���ƭ�= "+i);
 }
 public static void main(String argv[])
 {
  new ConstructorTest1(1);
 }
}
