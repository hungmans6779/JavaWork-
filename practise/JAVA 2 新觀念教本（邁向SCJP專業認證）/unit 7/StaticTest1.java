public class StaticTest1
{
 	
 static 
 {
  System.out.println(StaticTest1.x);
 }
 static int x=100;
 final public static void main(String argv[])
 {
  System.out.println(x);
 }
}