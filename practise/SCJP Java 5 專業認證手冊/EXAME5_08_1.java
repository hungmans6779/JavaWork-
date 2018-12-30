class Utils
{
 int getInt(String x) throws Exception {return 7; }	
}

public class EXAME5_08_1 extends Utils
{
 public static void main(String argv[]) throws Exception
 {
  Utils u=new EXAME5_08_1();
  System.out.println(u.getInt(argv[0]));
 }
 int getInt(String x)
 {
  return Integer.parseInt(x); 	
 }	
}