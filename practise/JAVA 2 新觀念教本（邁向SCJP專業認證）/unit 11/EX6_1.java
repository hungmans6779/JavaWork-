public class EX6_1
{
 public static void main(String argv[])
 {
  try
  {
   if(argv.length<1)
    throw new Exception("�S���{���Ѽ�");
   double i=Double.parseDouble(argv[0]);
   if(i<0)
    throw new Exception("�Ѽƻݤj��0");
   double j=Math.sqrt(i);
   System.out.println(i+ " ������ڬ� : "+j);
  }
  catch(Exception e)
  {
   System.out.println("�o�ͨҥ~ : "+e);
  } 
  finally
  {
   System.out.println("���{����hong�]�p");
  }
 }
}