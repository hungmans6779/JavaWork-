class Shadow1
{
 int leg=2;
 void bMethod()
 {
 	System.out.println("Shadow1");
 }	
}


public class ShadowTest1 extends Shadow1
{
 int leg=4;
 void  aMethod()
 {
 	System.out.println(super.leg);
  System.out.println(leg);	
 }	
 void bMethod()
 {
 	System.out.println("ShadowTest1");
 }	
 public static void main(String argv[])
 {
  //new ShadowTest1().aMethod();
  ShadowTest1 s=new ShadowTest1();
  if( s instanceof Shadow1)
  {
   ((Shadow1)s).bMethod();
   System.out.println(((Shadow1)s).leg);
  }
 }
}