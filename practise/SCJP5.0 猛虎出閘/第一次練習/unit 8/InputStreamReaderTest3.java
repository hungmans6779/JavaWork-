import java.io.*;
public class InputStreamReaderTest3
{
 public static void main(String argv[])
 {
 	 System.out.println("�п�J�z����ơA���{���|��z�ҿ�J��������InputStreamReaderTest3.txt�ɮפ��s��");
 	 System.out.print("�}�l��J���: ");
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
  	pro.println("�z�ҿ�J���r��O: "+s);
 	 }		
 	}
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}		
 }	
}