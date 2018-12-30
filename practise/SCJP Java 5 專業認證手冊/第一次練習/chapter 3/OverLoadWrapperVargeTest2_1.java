public class OverLoadWrapperVargeTest2_1
{
 public static void main(String argv[])
 {
  Integer a=10;
  amethod(a);
 }

  //static void amethod(Integer x)
  //{ System.out.println("Integer");}
  static void amethod(int ... x)
  { System.out.println("int vararg"); }
  	
  	
  //static void amethod(Long x)
  //{ System.out.println("Long");}
  static void amethod(Integer ... x)
  { System.out.println("Wrapper Integer varage"); }
  static void amethod(Long ... x)
  { System.out.println("Wrapper Long varage"); }
 
}