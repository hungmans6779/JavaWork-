public class EXAME8_06_1
{
 public static void main(String argv[])
 {
  new EXAME8_06_1().show();
 }
 void show()
 {
  class MethodInner
  {
   void showText()
   {
    System.out.println("我被顯示了");	
   }	
  }
  new MethodInner().showText();
 }
}