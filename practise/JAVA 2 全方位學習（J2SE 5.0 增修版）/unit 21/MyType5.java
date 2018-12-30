import java.io.*;
public class MyType5
{
 public static void main(String argv[])
 {
 	
 	try
 	{
   FileReader fIn=new FileReader("joke.txt");
   LineNumberReader lnr=new LineNumberReader(fIn);
   String data=lnr.readLine();
   while(data!=null)
   {
    System.out.println(lnr.getLineNumber()+":"+data);
    data=lnr.readLine();	
   }	
   fIn.close();
   lnr.close();
  }
  catch(IOException e)
  {
   e.printStackTrace();	
  }	 
 }


}