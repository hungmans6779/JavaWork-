public class AutoBoxingTest5_3
{
 public static void main(String argv[])
 {
  Long i=10l;
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