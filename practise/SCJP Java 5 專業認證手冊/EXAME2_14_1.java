class X
{
 void do1()
 {
  System.out.println("我是do1");	
 } 
}
class Y extends X 
{ 
 void do2()
 {
 	System.out.println("我是do2");
 } 
}

public class EXAME2_14_1
{
 public static void main(String argv[])
 {
  X x1=new X();
  X x2=new Y();
  Y y1=new Y();
  ((Y)x2).do2();
 }
}