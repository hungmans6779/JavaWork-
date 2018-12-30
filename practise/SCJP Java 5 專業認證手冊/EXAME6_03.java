import java.io.*;
public class EXAME6_03
{
 public static void main(String argv[])
 {
 	try
 	{
 	 BufferedWriter bw=new BufferedWriter(new FileWriter("f1"));
   //BufferedWriter b1=new BufferedWriter(new File("f"));
   BufferedWriter b2=new BufferedWriter(new FileWriter("f2"));
   BufferedWriter b3=new BufferedWriter(new PrintWriter("f3"));
   BufferedWriter b4=new BufferedWriter(new BufferedWriter(bw));
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}