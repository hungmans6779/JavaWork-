 public class InitializerTest2
{
 String str;
 int id;
 String name;
 static int statici;
 static String staticstr;
 
 
 public InitializerTest2()
 { }
 
 public InitializerTest2(int kind)
 {
  id=kind;	
 }
 
 {
  str="Instance Initializer Test2";
  id=1;
  name="InitializerTest2";  
  statici=2000;
  staticstr="statictest";
 }
 
 public static void main(String argv[])
 {
 	new InitializerTest2().show();
 	System.out.println("\n===================");
  new InitializerTest2(100).show();
 }
 
 void show()
 {
 	System.out.println("Str = "+str);
 	System.out.println(id);
 	System.out.println(name);	
 	System.out.println(statici);
 	System.out.println(staticstr);
 }	
}