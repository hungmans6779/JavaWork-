import java.io.*;
public class dataOutputExample
{
 public static void main(String argv[])
 {
 	double data;
 	try
 	{
 	 FileOutputStream fOut=new FileOutputStream("random.txt");
 	 DataOutputStream dos=new DataOutputStream(fOut);
 	 for (int i=0;i<9999;i++)
 	 {
 	 	data=Math.random();
 	 	dos.writeDouble(data);
 	 }		
 	 fOut.close();
 	 dos.close();
 	}
 	catch(IOException e)
 	{
 	 e.printStackTrace();	 
 	}		
 	
 }	

}