class X
{
 Y b=new Y();
 X()
 {
  System.out.print("X");
 }
}

class Y
{
 Y()
 {
  System.out.print("Y");
 }
}

public class EXAME135 extends X
{
 Y y=new Y();	
 EXAME135()
 {
 	System.out.println("Z");
 }	
 public static void main(String argv[])
 {
  new EXAME135();
 }
}