public class EX6_1
{
 public static void main(String argv[])
 {
  try
  {
   if(argv.length<1)
    throw new Exception("⊿Τ祘Α把计");
   double i=Double.parseDouble(argv[0]);
   if(i<0)
    throw new Exception("把计惠0");
   double j=Math.sqrt(i);
   System.out.println(i+ " キよ : "+j);
  }
  catch(Exception e)
  {
   System.out.println("祇ネㄒ : "+e);
  } 
  finally
  {
   System.out.println("セ祘Αパhong砞璸");
  }
 }
}