public class InterfaceTest1 implements InterfaceTT
{
 public static void main(String argv[])
 {
  InterfaceTest1 a=new InterfaceTest1();
  if(a instanceof InterfaceTT)
  {
   System.out.println("物件型別也可以由介面去轉換！！！");
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