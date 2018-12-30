class Father
{
 String name="father";
 public void greeting()
 {
 	System.out.println("From Father"); 
 }	
}

class Son extends Father
{
 public String name="Son";
 public void greeting()
 {
 	System.out.println("From Son");
 }		
}	


class Daughter extends Father
{
 String name="Daughter";
 public void greeting()
 {
  System.out.println("From Daughter");	
 }		
}	

public class P
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

