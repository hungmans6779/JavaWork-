public class RecursiveTest1_1
{
 static int value=0;	
 public static void main(String argv[])
 {
 	try
 	{
   System.out.println("sum = "+sum(999999999));
  }
  catch(StackOverflowError e)
  {
   System.out.println("我是小飛仔");
  }	 
 }
 static int sum(int i)
 {
  value+=i;
  if(i==1)
  {
   return value;
  }
  else
  {
   return sum(i-1);
  }
 }
}