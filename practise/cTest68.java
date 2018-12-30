import java.io.*;
public class cTest68
{
 public static void main(String argv[])
 {
 	try
 	{
   BufferedReader br=new BufferedReader(new FileReader("index.html"));
   BufferedWriter bw=new BufferedWriter(new FileWriter("index1.html",true));
   String input="";
   while((input=br.readLine())!=null)
   {
   
   	if(input.indexOf("<body>")!=-1)
   	{
   	 bw.write(input);
   	 bw.newLine();	
   	 bw.write("我是被插入的資料");
   	 bw.newLine();
   	}		
   	else
   	{
   	 bw.write(input);
   	 bw.newLine();
   	} 
   }
   
   br.close();
   bw.close();	
  }
  catch(Exception e){} 
 }
}