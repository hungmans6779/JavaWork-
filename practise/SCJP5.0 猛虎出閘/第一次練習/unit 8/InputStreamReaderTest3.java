import java.io.*;
public class InputStreamReaderTest3
{
 public static void main(String argv[])
 {
 	 System.out.println("請輸入您的資料，此程式會把您所輸入的資料轉到InputStreamReaderTest3.txt檔案中存放");
 	 System.out.print("開始輸入資料: ");
 	try
 	{
 	 InputStreamReader fin=new InputStreamReader(System.in);
 	 BufferedReader bfin=new BufferedReader(fin);
 	 FileOutputStream fout=new FileOutputStream("InputStreamReaderTest3.txt");
 	 BufferedOutputStream bfout=new BufferedOutputStream(fout);
 	 PrintStream pro=new PrintStream(bfout,true);
 	 System.setOut(pro);
 	 String s;
 	 while((s=bfin.readLine()).length()!=0)
 	 {
 	  if(s.equals("quit"))
 	  {
 	   pro.flush();
 	   pro.close();
 	   bfout.close();
 	   fout.close();
 	   bfin.close();
 	   fin.close();	
 	   break;
  	}		
  	pro.println("您所輸入的字串是: "+s);
 	 }		
 	}
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}		
 }	
}