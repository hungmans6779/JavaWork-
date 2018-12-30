public class InterfaceTest2
{
 public static void main(String argv[])
 {
  InterfaceTT ii=new InterfaceTT()
  {
   public void show()
   {
    System.out.println("§Ú¬O¤¶­±§r");
   }
  };
  ii.show();
 }
}

interface InterfaceTT
{
 void show();
}