import java.io.*;
class EXAME5
{
 public static void main(String argv[])
 {
  try
  {
   BufferedWriter out=null;
   out=new BufferedWriter(new FileWriter("abc.text",true));
   //out=new BufferedWriter(new FileWriter("abc.text"));
    out.write("would");
    out.newLine();
   out.close();
  
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}