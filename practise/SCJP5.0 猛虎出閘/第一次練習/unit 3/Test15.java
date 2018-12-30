class Test15
{
 public static void main(String argv[])
 {
  new Test15().show();
 }
 public static void show()
 {
  System.out.println("我是方法類別");
  public static class MethodClass
  {
   static void show1()
   {
   	System.out.println("我是我");	
   }	
  }
  // new MethodClass().show1();
 }
}