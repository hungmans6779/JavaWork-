public class ExceptionTest6
{
 static int num[]={0,2,4};
 static String str;
 public static void main(String argv[])
 {
  calc1(0);
  System.out.println("���H�z�F...........");

 }
 static void calc1(int i)
 {
  try
  {
 	 calc2(0);
  }
 	catch(ArithmeticException ae)
 	{
 	 System.out.println("���d�I��ҥ~�F.............");	
 	}	 
 }	
 static void calc2(int i)
 {
 	double ans=0.0;
 	ans=20/num[i];
 }	
}