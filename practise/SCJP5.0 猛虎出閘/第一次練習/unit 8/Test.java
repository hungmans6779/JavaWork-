import java.io.*;
public class Test
{
 public static void main(String argv[])
 {
  String s="Java ��J�P��X�]java.io�禡�w�^";
  byte data[]=s.getBytes();
  System.out.println("�N�r�� \""+s+"\" �g���ɮפ�");
  System.out.println("��ƪ���: "+data.length+" Bytes.");
  try
  {
   System.out.println("�b�ɮרt�β��ͤF�@��FileOutputStream.txt�������ɮ�");	
   FileOutputStream fout=new FileOutputStream("FileOutputStream.txt",true);
   for(int i=0;i<Integer.MAX_VALUE;i++)
   {
    fout.write(data);	
   } 
   fout.close();
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	
 }
}