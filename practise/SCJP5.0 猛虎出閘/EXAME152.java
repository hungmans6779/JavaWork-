public class EXAME152
{
 public enum Color {RED,GREEN,BLUE};
 public void foo()
 {
  for(Color c:Color.values())
  {
   System.out.println(c);
  }
 }
 public static void main(String argv[])
 {
 	new EXAME152().foo();
 }	
}