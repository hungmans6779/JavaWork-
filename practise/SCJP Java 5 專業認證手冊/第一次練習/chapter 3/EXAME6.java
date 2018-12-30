public class EXAME6
{
 EXAME6(){}
 EXAME6(EXAME6 m){m1=m;}
 EXAME6 m1;
 public static void main(String argv[])
 {
  EXAME6 m2=new EXAME6(); 
  EXAME6 m3=new EXAME6(m2); m3.go();
  EXAME6 m4=m3.m1;          m4.go();
  EXAME6 m5=m2.m1;          m5.go();
 }
 void go()
 {
 	System.out.print("hi ");
 }	
}