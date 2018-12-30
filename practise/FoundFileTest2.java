import java.io.*;
public class FoundFileTest2
{
 public static void main(String argv[])
 {
 	String filename="";
 	do
 	{
 	 try
 	 {
 	 	InputStreamReader isr=new InputStreamReader(System.in);
 	 	BufferedReader br=new BufferedReader(isr);
 	 	System.out.print("請輸入一個要搜尋的檔案名稱===>");
 	 	filename=br.readLine();
 	 	openFile(filename);
 	 	break;
 	 }
 	 catch(IOException ioe)
 	 {
 	  System.out.println(ioe.getLocalizedMessage());	
 	 }			
 	}while(true);	
 	System.out.println("已經找到:"+filename+"...");
 }
 public static void openFile(String filename) throws FileNotFoundException
 {
  FileInputStream fis=new FileInputStream(filename);	
 }	
}