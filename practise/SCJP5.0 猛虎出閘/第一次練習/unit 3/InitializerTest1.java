public class InitializerTest1
{
 String str;
 int id;
 String name;
 
 public InitializerTest1()
 {
  id=2;
 }
 
 public InitializerTest1(int kind){}
 
 
 {
  str="Instance Initializer Test";
  id=1;
  name="InitializerTest1";  
 }
 
 public static void main(String argv[])
 {
 	new InitializerTest1(100).show();
 	System.out.println("\n===================");
 	new InitializerTest1().show();
 }
 
 void show()
 {
 	System.out.println("Str = "+str);
 	System.out.println(id);
 	System.out.println(name);	
 }	
}