public class OverLoadWrapperVargeTest2
{
 public static void main(String argv[])
 {
  Short a=10;
  amethod(a);
 }
  //static void amethod(short x)
  //{ System.out.println("short"); }
  static void amethod(int x)
  { System.out.println("int"); }
  //static void amethod(long x)
  //{ System.out.println("long"); }
  static void amethod(Integer x)
  { System.out.println("Integer");}
  static void amethod(int ... x)
  { System.out.println("private int varage"); }
  static void amethod(Integer ... x)
  { System.out.println("Wrapper Integer varage"); }
  static void amethod(Long ... x)
  { System.out.println("Wrapper Long varage"); }
 
}