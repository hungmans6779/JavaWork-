import java.io.*;
public class ObjectOutputExample
{
 public static void main(String argv[])
 {
  Student st=new Student("¬x¹Å§»",85,92,87);
  st.printData();
  try
  {
   FileOutputStream fOut=new FileOutputStream("StudentScoreObject.txt");
   ObjectOutputStream objOut=new ObjectOutputStream(fOut);
   objOut.writeObject(st);	
   fOut.close();
   objOut.close();
  }
  catch(IOException e)
  {
   e.printStackTrace();	
  }			
 }	
}