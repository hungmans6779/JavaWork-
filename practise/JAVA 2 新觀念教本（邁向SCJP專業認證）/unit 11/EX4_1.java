public class EX4_1
{
 public static void main(String argv[])
 {
  System.out.println("�i�Jmain()��k");
  try
  {
   a();
  }
  catch(Exception e)
  {
   System.out.println("�o�ͨҥ~ : "+e);
  }
  System.out.println("���}main()��k");
 }
 static void a()
 {
 	System.out.println("�i�J��k a");
 	b();
 	System.out.println("���}��k a");
 }	
 static void b()
 {
 	System.out.println("�i�J��k b");
 	c();
 	System.out.println("���}��k b");
 }	
 static void c()
 {
 	System.out.println("�i�J��k c");
 	int i=10/0;
 	d();
 	System.out.println("���}��k c");
 }	
 static void d()
 {
 	System.out.println("�i�J��k d");
 	System.out.println("���}��k d");
 }	
}