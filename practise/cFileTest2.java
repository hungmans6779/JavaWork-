import java.io.*;
public class cFileTest2
{
 public static void main(String argv[]) throws IOException
 {
  File directory=new File("D:\\�i��F�{���]�p�Z�ǭ��������n��ơj�]�Ŭ�^\\JavaTest");
  String dir[]=directory.list();
  File f;
  for(String value:dir)
  {
   f=new File(value);
   System.out.println(value+(f.isDirectory()?"�O�ؿ�":"�O�ɮ�"));
  } 
  System.gc();
 }
}