public class MathTest1
{
 public static void main(String argv[])
 {
 	//ceil�O�L����i��
 	double a1=343.643;
  double b1=Math.ceil(a1);
  System.out.println("b1 = "+b1);
  
  //floor()�O�L����˥h
 	double a2=343.643;
  double b2=Math.floor(a2);
  System.out.println("b2 = "+b2);
 	
 	//round()�O�|�ˤ��J
  double a3=343.643;
  long b3=Math.round(a3);
  System.out.println("b3 = "+b3);
 }
}