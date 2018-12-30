class Father4
{
 public Father4(char c)
 {
 	System.out.println("父親的類別");
 }	
}

class Son4 extends Father4
{ 
 public Son4()
 {
 	this('A');
 	System.out.println("兒子的類別");
 }		
 public Son4(char c)
 {
 	super(c);
 }	
}

public class Extend4
{
 public static void main(String argv[])
 {
   new Son4();
 }
}