public class MathTest1
{
 public static void main(String argv[])
 {
 	//ceil是無條件進位
 	double a1=343.643;
  double b1=Math.ceil(a1);
  System.out.println("b1 = "+b1);
  
  //floor()是無條件捨去
 	double a2=343.643;
  double b2=Math.floor(a2);
  System.out.println("b2 = "+b2);
 	
 	//round()是四捨五入
  double a3=343.643;
  long b3=Math.round(a3);
  System.out.println("b3 = "+b3);
 }
}