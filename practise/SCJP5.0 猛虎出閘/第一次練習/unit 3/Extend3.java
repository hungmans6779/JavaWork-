class Father3
{
 public Father3(char c)
 {
 	System.out.println("父親的類別");
 }	
}

class Son3 extends Father3
{ 
  public Son3()
 {
 	super('A');
 	System.out.println("兒子的類別");
 }		
}

public class Extend3
{
  public static void main(String argv[])
 {
  Son3 son1=new Son3();
 }
}