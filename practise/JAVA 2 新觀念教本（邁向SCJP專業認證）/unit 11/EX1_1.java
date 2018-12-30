public class EX1_1
{
 public static void main(String argv[])
 {
  String []seasons={"spring","summer","fail","winter"};
  try
  {
   for(int i=0;i<5;i++)
   {
    System.out.println(seasons[i]);
   }
  }
  catch(Throwable e)
  {
   e.printStackTrace();
  } 
 }
}