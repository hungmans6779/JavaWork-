public class AutoBoxingTest5
{
 public static void main(String argv[])
 {
  long i=10l;
  go(i,i);
 }

 static void go(short ... var)
 {
 	System.out.println("short");
 }	
 
 static void go(int ... var)
 {
 	System.out.println("int");
 }	
  static void go(long ... var)
 {
 	System.out.println("long");
 }	
}