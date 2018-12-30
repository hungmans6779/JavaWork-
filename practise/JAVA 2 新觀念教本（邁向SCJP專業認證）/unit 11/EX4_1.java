public class EX4_1
{
 public static void main(String argv[])
 {
  System.out.println("進入main()方法");
  try
  {
   a();
  }
  catch(Exception e)
  {
   System.out.println("發生例外 : "+e);
  }
  System.out.println("離開main()方法");
 }
 static void a()
 {
 	System.out.println("進入方法 a");
 	b();
 	System.out.println("離開方法 a");
 }	
 static void b()
 {
 	System.out.println("進入方法 b");
 	c();
 	System.out.println("離開方法 b");
 }	
 static void c()
 {
 	System.out.println("進入方法 c");
 	int i=10/0;
 	d();
 	System.out.println("離開方法 c");
 }	
 static void d()
 {
 	System.out.println("進入方法 d");
 	System.out.println("離開方法 d");
 }	
}