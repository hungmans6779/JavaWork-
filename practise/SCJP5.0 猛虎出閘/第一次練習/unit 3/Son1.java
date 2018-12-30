class Father
{
 String name="Father";
 String getName()
 {
 	return name;
 }		
 String geeting()
 {
 	return "class Father";
 }	
}	

public class Son1 extends Father
{
 String name="Son";
 String geeting()
 {
 	return "class Son";
 }		
 
 void go()
 {
 	System.out.println(name);
 	System.out.println(this.name);
 	System.out.println(super.name);
 	System.out.println(((Son1)this).name);
 	System.out.println(((Father)this).name);
 	System.out.println(((Son1)this).geeting());
 	System.out.println(((Father)this).geeting());
 	System.out.println(super.geeting());
 }	
 
 public static void main(String argv[])
 {
  new Son1().go();
 }	
}	