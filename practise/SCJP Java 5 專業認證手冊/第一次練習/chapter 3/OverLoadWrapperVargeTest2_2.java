public class OverLoadWrapperVargeTest2_2
{
 public static void main(String argv[])
 {
  byte a=10;
  amethod(a);
 }


  static void amethod(int ... x)
  { System.out.println("int vararg"); }
  	
  	

  static void amethod(Integer ... x)
  { System.out.println("Wrapper Integer varage"); }

 
}