public class ConstructorTest4
{
 public ConstructorTest4()
 {
 	this("dog");
 }	
 public ConstructorTest4(String str)
 {
  this();	
 }	
 public static void main(String argv[])
 {
 	new ConstructorTest4();
 }	
}