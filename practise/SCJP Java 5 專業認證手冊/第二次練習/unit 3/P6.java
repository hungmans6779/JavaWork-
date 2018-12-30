public class P6
{
 P6(){ }
 P6(P6 m) { m1=m; }
 P6 m1;	
 public static void main(String argv[])
 {
  P6 m2=new P6();
  P6 m3=new P6(m2); m3.go();
  P6 m4=m3.m1;      m4.go();
  P6 m5=m2.m1;      m5.go();
 }
 void go()
 {
  System.out.print("hi "); 	
 }	
}