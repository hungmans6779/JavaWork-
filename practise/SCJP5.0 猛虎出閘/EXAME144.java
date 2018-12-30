import java.io.*;
public class EXAME144
{
 public static void main(String argv[])
 {
  try
  {
   File x1=new File("EXAME144.txt");
   FileReader x2=new FileReader(x1);
   BufferedReader x4=new BufferedReader(x2);
   String x3=null;
   while((x3=x4.readLine())!=null)
   {
   	System.out.println(x3);
   }		
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
  x2.close();
 }
}