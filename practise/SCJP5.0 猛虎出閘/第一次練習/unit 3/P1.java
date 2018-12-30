class Father
{
 static String name="father";
 public static void greeting()
 {
 	System.out.println("From Father"); 
 }	
}

class Son extends Father
{
 public static String name="Son";
 static public void greeting()
 {
 	System.out.println("From Son");
 }		
}	


class Daughter extends Father
{
 static String name="Daughter";
 public static void greeting()
 {
  System.out.println("From Daughter");	
 }		
}	

public class P1
{
 public static void main(String argv[])
 {
 	Father father=new Son();
 	father.greeting();
 	System.out.println(father.name);
 	father=new Daughter();
 	father.greeting();
 	System.out.println(father.name);
 }		
}	

