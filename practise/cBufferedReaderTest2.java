import java.io.*;
public class cBufferedReaderTest2
{
 public static void main(String argv[]) throws IOException,Exception
 {
  File file=new File("���إ�.txt");
  if(file.exists())
  {
   FileReader fr=new FileReader(file);
   BufferedReader br=new BufferedReader(fr);
   String str="";
   //String newStr="";
   String newStr[]=new String[10];
   String temp="";
   int count=0;
   while((str=br.readLine())!=null)
   {
    temp=str.replaceAll("���إ�","�ۥѤH");
    newStr[count]=temp;
    count++;
   }	
   br.close();
   fr.close();
   file.delete();
   file.createNewFile();
   FileWriter fw=new FileWriter(file,true);
   BufferedWriter bw=new BufferedWriter(fw);
   int co=0;
   while(true)
   {
    if(newStr[co]!=null && newStr[co]!="")	
    {
     bw.write(newStr[co]);	
     bw.newLine();
    } 
    if(newStr[co]==null)
     break;
    co++;
   }	
   bw.close();
   fw.close();
  }
  else
  {
   System.out.println("���إ�.txt���ɮפ��s�b");
  }	
 }
}