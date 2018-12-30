class Utils
{
 int getInt(String x) throws Exception {return 7; }	
}

public class EXAME5_08_2 extends Utils
{
 public static void main(String argv[])
 {
  Utils u=new EXAME5_08_2();
  try
  {
   System.out.println(u.getInt(argv[0]));
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
 int getInt(String x)
 {
  return Integer.parseInt(x); 	
 }	
}