import com.foo.*;
public class Test1
{
 public static void main(String argv[])
 {
  MyClass1 my1=new MyClass1();
  my1.hi();
  com.foo.MyClass1 my2=new com.foo.MyClass1();
  my2.hi();
 }
}