public class OutInnerClassTest3
{
 public static void main(String argv[])
 {
  OutInnerClassTest3.InnerClass in=new OutInnerClassTest3().new InnerClass();
  in.show();
 }
 public class InnerClass
 {
  void show()
  {
   System.out.println("�ڬO�������O");
  }
 }
}