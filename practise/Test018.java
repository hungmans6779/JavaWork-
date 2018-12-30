public class Test018
{
 public static void main(String argv[])
 {
  String cmd="java ExternalProgram";
  if(argv.length==0)
  {
   cmd+=0;	
  }	
  else
  {
   cmd+=argv[0];
  }	
  try
  {
   Process ps=Runtime.getRuntime().exec(cmd);
   if(ps.exitValue()==0)
   {
    System.out.println("程式正常執行");
   }
   else
   {
   	System.out.println("程式執行錯誤...");
   }		
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
 }
}