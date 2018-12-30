import java.io.*;
public class PrintWriterTest1
{
 public static void main(String argv[])
 {
  try
  { 
   File file=new File("PrintWrite1.txt");
   FileWriter fw=new FileWriter(file);
   PrintWriter pw=new PrintWriter(fw);
   pw.println("Hello");
   pw.println("Java");
   pw.println("SCJP");
   pw.close();
   fw.close();
   FileReader fi=new FileReader(file);
   BufferedReader fr=new BufferedReader(fi);
   String str=null;
   while((str=fr.readLine())!=null)
   {
    System.out.println(str);
   } 
   fr.close();
   fi.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());
  } 
 }
}