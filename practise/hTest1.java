public class hTest1
{
 public static void main(String argv[])
 {
   String []c={"a","b","c","d","e"};
   String okStr="";
   String str="psexec \\gb-203-";
   String cc=" -u	administrator -p P@ssw0rd ipconfig/release";
   for(int i=0;i<=4;i++)
   {
   	for(int j=1;j<=6;j++)
   	{
   	 str="psexec \\\\gb-203-";
   	 cc=" -u administrator -p P@ssw0rd ipconfig/release";	
   	 okStr=str+String.valueOf(c[i])+String.valueOf(j)+cc;
   	 System.out.println(okStr);
   	 try
   	 {
   	   Runtime.getRuntime().exec(okStr);
      if(i==4&&j==6)
      {
       //Runtime.getRuntime().exec("ipconfig /release");
       Runtime.getRuntime().exec("exit");
      } 
   	 }
   	 catch(Exception e){} 
   	}	
   }	
 }		
}	
























