public class EX2
{
 public static void main(String argv[])
 {
  ClassB b=new ClassB();
  ClassC c=new ClassC();
  System.out.println("b 為InterfaceA 型別 :"+(b instanceof InterfaceA));
  System.out.println("c 為InterfaceA 型別 :"+(c instanceof InterfaceA));
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