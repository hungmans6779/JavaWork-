import java.io.*;
public class cTest67
{
 public static void main(String argv[])
 {
 	try
 	{
 	 PrintStream ps=new PrintStream("cTest67.txt");
 	 System.setOut(ps);
 	}
 	catch(Exception e){} 
 }		
}