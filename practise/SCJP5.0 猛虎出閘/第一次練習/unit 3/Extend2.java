class Father2
{
 public Father2()
 {
 	System.out.println("父親的類別");
 }	
}

class Son2 extends Father2
{ 
  public Son2()
 {
 	System.out.println("兒子的類別");
 }		
}

public class Extend2
{
  public static void main(String argv[])
 {
  Son2 son1=new Son2();
 }
}