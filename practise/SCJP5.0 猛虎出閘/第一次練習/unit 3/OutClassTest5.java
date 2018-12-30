public class OutClassTest5
{
 static int sx=7;
 int x=9;
 private class InnerClass
 {
 	/* Regular Inner Class 內部的成員只能有non-static，其它都不可以......... */
  //static int sx=77;
  //static int x=9;
  int sx=77;
  int x=99;
  void foo()
  {
   int sx=777;
   int x=999;
   System.out.println("Local sx = "+sx);
   System.out.println("Local x = "+x);
   System.out.println("Regular this sx = "+this.sx);
   System.out.println("Regular this x = "+this.x);
   System.out.println("OutClass sx = "+OutClassTest5.sx);
   System.out.println("OutClass this sx = "+OutClassTest5.this.sx);
   System.out.println("OutClass this x = "+OutClassTest5.this.x);
   //System.out.println("OutClass this x = "+OutClassTest5.x);
  }
 }
 public static void main(String argv[])
 {
 	new OutClassTest5().new InnerClass().foo();
 }	
}