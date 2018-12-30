class OutClass
{
 private static int sx=9;
 private int x=7;
 class InnerClass
 {
  private int x=77;
  public void foo()
  {
   int x=777;
   System.out.println("Local x = "+x);
   System.out.println("InnerClass x= "+this.x);
   System.out.println("OutClass x= "+OutClass.this.x);
   System.out.println("OutClass sx= "+OutClass.sx);
  }
 }
}

public class InnerClassTest4
{
 public static void main(String argv[])
 {
  new OutClass().new InnerClass().foo();	
 }	
}	