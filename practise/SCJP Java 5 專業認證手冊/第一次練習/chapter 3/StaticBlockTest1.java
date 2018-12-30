public class StaticBlockTest1
{
 static int x;
 int y;
 static 
 {
 	x=3;
 }		
 { y=2; }
 public static void main(String argv[])
 {
  StaticBlockTest1 s=new StaticBlockTest1();
  System.out.println(s.x);
  System.out.println(s.y);
 }
}