public class InterfaceTest2
{
 public static void main(String argv[])
 {
  InterfaceTT ii=new InterfaceTT()
  {
   public void show()
   {
    System.out.println("�ڬO�����r");
   }
  };
  ii.show();
 }
}

interface InterfaceTT
{
 void show();
}