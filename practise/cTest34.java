class A
{
 private int x;
 protected int y=8;
 protected void setX(int x)
 {
 	if(x>0 && x<=10)
 	 this.x=x;
 	else
 	 this.x=5;
 }	
 protected int getX()
 {
 	return x;
 }	
}

class Aa extends A
{
 public String toString()
 {
 	setX(5);
 	return String.valueOf(getX()+1);
 }		
}	

public class cTest34 
{
 public static void main(String argv[])
 {
  System.out.println(new Aa());
  System.out.println("=============================");
  
  A a=new A();
  a.setX(3);
  System.out.println(a.getX());
  System.out.println(a.y);
 }
 
}