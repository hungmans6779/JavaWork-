public class AbstractTest1
{
 public static void main(String argv[])
 {
  AbstractTT tt=new AbstractTT()
  {
   public void show()
   {
    System.out.println("�ڬO��H���O�r");
   }
  };
  tt.show();
 }
}
abstract class AbstractTT
{
 abstract void show();
}