public class Test019
{
 public static void main(String argv[])
 {
  try
  {
   Process ps=Runtime.getRuntime().exec("notepad");
   ps.waitFor();
   if(ps.exitValue()==0)
    System.out.println("�{�����榨�\...");
   else
    System.out.println("�{�����楢��...");		
  }	
  catch(Exception e)
  {
   e.printStackTrace();	
  }	
 }
}