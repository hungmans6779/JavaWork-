public class OverLoadWrapperVarargeTest1
{
  static byte bx=10;
 	static short sx=10;
  static int ix=10;
  static long lx=10L;
  static Byte Bx=10;
  static Short Sx=10;
  static Integer Ix=10;
  static Long Lx=10L;
  
 public static void main(String argv[])
 {
 // testPrimitive();	
  //testWrapper();
 
  
 }
  static void amethod(byte x)
 { System.out.println("byte");}	
  static void amethod(short x)
 { System.out.println("short");}	
 static void amethod(int x)
 { System.out.println("int");}	
 static void amethod(long x)
 { System.out.println("long");}
 static void amethod(Integer x)
 { System.out.println("Integer");}
 static void amethod(Long x)
 { System.out.println("Long"); }
//static void amethod(int ... x)
// { System.out.println("private int varage"); }
// static void amethod(long ... x)
// { System.out.println("private long varage"); }
 static void amethod(Integer ... x)
 { System.out.println("Wrapper Integer varage"); }
 static void amethod(Long ... x)
 { System.out.println("Wrapper Long varage"); }
 
  static void testPrimitive()
  {
  	amethod(bx);  //int
   amethod(sx);  //int
   amethod(ix);  //int 
   amethod(lx); //long  
  }
 static void testWrapper()
 {
 	//amethod(Bx); 
  //amethod(Sx);
 	amethod(Ix);
 	amethod(Lx);
 }	
}