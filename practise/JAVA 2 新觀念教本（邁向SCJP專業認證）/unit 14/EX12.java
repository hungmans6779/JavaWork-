import java.io.*;
public class EX12
{
 public static void main(String argv[]) throws IOException
 {
  String path;
  if(argv.length<1)
   path=".";
  else
   path=argv[0];
   
  File f=new File(path);
  System.out.println("������|:"+f.getAbsolutePath());
  System.out.println("�зǸ��|:"+f.getCanonicalPath());
  System.out.println("���ؿ�:"+f.isDirectory());
  System.out.println("���ɮ�:"+f.isFile());
 }
}