import java.io.*;
public class OpenFileTestv2
{
 static String fileName="";
 public static void main(String argv[])
 { 
  do
  {
   try
   {
    System.out.println("\n\n\n\n\n\n");
    System.out.print("�п�J�z�n�}�Ҫ��ɮצW�� :");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    fileName=br.readLine(); 
    openFile(fileName);
    break;
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
  }while(true);
  System.out.println("�z�� '"+fileName+" ' �}�Ҧ��\........");
 }
 public static void openFile(String fileName) throws FileNotFoundException
 {
  FileInputStream f=new FileInputStream(fileName);
 }
}