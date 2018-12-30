class MethodRegularOutClassTest2
{
 static int sx=7;
 int x=9;
 public static void main(String argv[])
 {
  new MethodRegularOutClassTest2().foo();
 }
 void foo()
 {
  int sx=77;
  int x=99;
  final int kk=222;
  class Inner
  {
   int sx=777;
   int x=999;	
   void show()
   {
    int sx=7777;
    int x=9999;
    System.out.println("kk = "+kk);
    System.out.println("Local sx = "+sx);
    System.out.println("Local x = "+x);
    System.out.println("Inner's sx = "+this.sx);
    System.out.println("Inner's x = "+this.x);
    System.out.println("OutClass'sx = "+MethodRegularOutClassTest2.sx);
    System.out.println("OutClass'sx = "+MethodRegularOutClassTest2.this.sx);
    System.out.println("OutClass'x = "+MethodRegularOutClassTest2.this.x);
   }
  }
  new Inner().show();
 
 }	
}