public class EX6_1
{
 public static void main(String argv[])
 {
  try
  {
   if(argv.length<1)
    throw new Exception("沒有程式參數");
   double i=Double.parseDouble(argv[0]);
   if(i<0)
    throw new Exception("參數需大於0");
   double j=Math.sqrt(i);
   System.out.println(i+ " 的平方根為 : "+j);
  }
  catch(Exception e)
  {
   System.out.println("發生例外 : "+e);
  } 
  finally
  {
   System.out.println("本程式由hong設計");
  }
 }
}