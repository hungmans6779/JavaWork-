public class AbstractTest1
{
 public static void main(String argv[])
 {
  AbstractTT tt=new AbstractTT()
  {
   public void show()
   {
    System.out.println("我是抽象類別呀");
   }
  };
  tt.show();
 }
}
abstract class AbstractTT
{
 abstract void show();
}