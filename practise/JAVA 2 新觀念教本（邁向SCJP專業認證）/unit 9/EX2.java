public class EX2
{
 public static void main(String argv[])
 {
  ClassB b=new ClassB();
  ClassC c=new ClassC();
  System.out.println("b ��InterfaceA ���O :"+(b instanceof InterfaceA));
  System.out.println("c ��InterfaceA ���O :"+(c instanceof InterfaceA));
 }
}

interface InterfaceA
{
 void m();
}
class ClassB
{
 public void m(){}
}

class ClassC implements InterfaceA
{
 public void m()
 {
 
 }
}