import java.io.*;
public class FileTest3
{
 public static void main(String argv[])
 {
  String path="H:/javawork/practise/�r��X�h/unit 8";
  File f1=new File(path);
  String data[]=f1.list();
  for(int i=0;i<data.length;i++)
  {
   File f2=new File(path+data[i]);
   if(f2.isDirectory())
   {
    System.out.println(data[i]+" �O�ؿ�.");	
   }
   else
   {
    System.out.println(data[i]+" �O�ɮ�.");	
   }
  } 	
 }
}