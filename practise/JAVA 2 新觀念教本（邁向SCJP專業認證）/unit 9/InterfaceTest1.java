public class InterfaceTest1 implements InterfaceTT
{
 public static void main(String argv[])
 {
  InterfaceTest1 a=new InterfaceTest1();
  if(a instanceof InterfaceTT)
  {
   System.out.println("���󫬧O�]�i�H�Ѥ����h�ഫ�I�I�I");
  }
 }
 public void show()
 {
  System.out.println("InterfaceTest");
 }
}

interface InterfaceTT
{
 void show();
}