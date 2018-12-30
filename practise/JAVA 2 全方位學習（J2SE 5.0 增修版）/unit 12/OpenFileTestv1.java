import java.io.*;
public class OpenFileTestv1
{
 static String fileName="";
 public static void main(String argv[])
 {
  do
  {
   System.out.print("�п�J�@���ɮצW��: ");
   InputStreamReader ir=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(ir);
   try
   {
     fileName=br.readLine();
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
  }while(!openFile(fileName));
  System.out.println("�}���ɮצ��\");
 }
 public static boolean openFile(String fileName)
 {
  try
  {
   FileInputStream f=new FileInputStream(fileName);
   return true;
  }
  catch(FileNotFoundException e)
  {
   e.printStackTrace();
   return false;
  }
 }
}