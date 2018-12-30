import java.io.*;
public class MyDir1
{
 public static void main(String argv[])
 {
 	File f=new File(System.getProperty("user.dir"));
 	File file[]=f.listFiles();
 	for (int i=0;i<file.length;i++)
 	{
 	 if(file[i].isDirectory())
 	 {
 	 	System.out.print("<Dir>\t");
 	 }		
 	 else
 	 {
 	 	System.out.print("\t"+file[i].length());
 	 	System.out.println("\t"+file[i].getName());
 	 }		
 	}	
 	
 }		
}	