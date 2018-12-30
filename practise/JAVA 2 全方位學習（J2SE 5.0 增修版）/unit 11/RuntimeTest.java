 public class RuntimeTest
 {
  public static void main(String argv[])
  {
   String cmd="java ExternalProgram ";
   if (argv.length==0)
   {
    cmd += 0;
   }
   else
   {
    cmd += argv[0];
   }
   try
   {
     Process ps=Runtime.getRuntime().exec(cmd);
     ps.waitFor();
     if(ps.exitValue() ==0)
     {
      System.out.println("外部程式已正常結束 ....."); 
     }
     else
     {
      System.out.println("外部程式不正常結束 .....");  
     }
   }
   catch(Exception e)
   {
    e.printStackTrace();
   }  
  }
 }