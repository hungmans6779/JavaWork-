class Father2
{
 public Father2()
 {
 	System.out.println("���˪����O");
 }	
}

class Son2 extends Father2
{ 
  public Son2()
 {
 	System.out.println("��l�����O");
 }		
}

public class Extend2
{
  public static void main(String argv[])
 {
  Son2 son1=new Son2();
 }
}