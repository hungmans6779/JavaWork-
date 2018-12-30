class StaticInnerClassTest4
{
 private int x=7;
 private static int sx=99;
 static class Inner
 {
  int x=77;
  private static int sx=99;
  void fooA()
  {
   int x=777;
   int sx=999;
   System.out.println("Local x = "+x);
   System.out.println("Local sx = "+sx);
   System.out.println("Inner'x = "+this.x);
   System.out.println("Inner'sx = "+this.sx);
   //System.out.println("StaticInnerClassTest4'x = "+StaticInnerClassTest4.this.x);
   System.out.println("StaticInnerClassTest4'sx = "+StaticInnerClassTest4.sx);
  }
  static void fooB()
  {
   //System.out.println("Inner'x = "+x);	
   System.out.println("Inner'sx = "+sx);
   //System.out.println("StaticInnerClassTest4'x = "+StaticInnerClassTest4.this.x);	
   System.out.println("StaticInnerClassTest4'sx = "+StaticInnerClassTest4.sx);
  }	
 }
 public static void main(String argv[])
 {
 	new StaticInnerClassTest4.Inner().fooA();
 	System.out.println("================================");
 	StaticInnerClassTest4.Inner.fooB();
 }
}