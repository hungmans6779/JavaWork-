class MethodRegularOutClassTest1
{
 public static void main(String argv[])
 {
  new MethodRegularOutClassTest1().see();
 }
 void see()
 {
  class Inner
  {
   void foo()
   {
    System.out.println("�ڬO��k�������O");
   } 
  }
  new Inner().foo();
 }
}