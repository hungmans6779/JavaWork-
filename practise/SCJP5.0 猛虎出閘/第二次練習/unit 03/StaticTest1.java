public class StaticTest1
{
 public static void main(String argv[])
 {
 }
 void aMethod()
 {
  bMethod();
  dMethod();	
 }	 
 void bMethod(){}
 
 static void cMethod()
 {
  //bMethod();
  dMethod();	
 }	
 static void dMethod()
 {
  new StaticTest1().bMethod();	
 }	
 
}