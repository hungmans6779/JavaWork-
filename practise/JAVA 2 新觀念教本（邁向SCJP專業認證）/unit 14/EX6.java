import java.io.*;
public class EX6
{
 public static void main(String argv[]) throws IOException
 {
  if(argv.length<1)
  {
   System.out.println("�п�J�@�ӱ��s�ɪ��ɮצW��");
   return;	
  }	
  FileWriter fw=new FileWriter(argv[0]);
  BufferedWriter bfw=new BufferedWriter(fw);
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  String str;
  System.out.println("�ж}�l��J�@���峹�a------(�����ɡA�Цb�s����C��Jq ���})");
  while(!(str=bin.readLine()).equals("q"))
  {
   bfw.write(str);
   bfw.newLine();	
  }	
  bin.close();
  in.close();
  bfw.flush();
  bfw.close();
  fw.close();
 }
}