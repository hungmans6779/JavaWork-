public class Test019
{
 public static void main(String argv[])
 {
  try
  {
   Process ps=Runtime.getRuntime().exec("notepad");
   ps.waitFor();
   if(ps.exitValue()==0)
    System.out.println("程式執行成功...");
   else
    System.out.println("程式執行失敗...");		
  }	
  catch(Exception e)
  {
   e.printStackTrace();	
  }	
 }
}