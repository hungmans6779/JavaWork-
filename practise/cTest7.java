import java.io.*;
public class cTest7
{
 public static void main(String argv[])
 {
  try
  {
   File file=new File("d:\\test.txt");
   if(file.exists())
   {
    System.out.println("�ɮפw�g�s�b");	
   }
   else
   {
    if(!file.createNewFile())
     System.out.println("�ɮ׫إߥ���");  
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}