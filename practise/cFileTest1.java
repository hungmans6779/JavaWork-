import java.io.*;
import java.util.*;
public class cFileTest1
{
 public static void main(String argv[]) throws IOException
 {
  File file=new File("D:\\�i��F�{���]�p�Z�ǭ��������n��ơj�]�Ŭ�^\\JavaTest\\Test.txt"); 
  if(file.exists())
   System.out.println("���ɮפw�s�b");
  else
  	System.out.println(file.createNewFile()?"���ɮ׫إߦ��\":"���ɮ׫إߥ���");	
  System.out.println(file.canRead()?"�ɮץi�HŪ��":"�ɮפ��i�HŪ��");
  System.out.println(file.canWrite()?"�ɮץi�H�g�J":"�ɮפ��i�H�g�J");
  System.out.println("���ɮת�������|:"+file.getAbsolutePath());
  //System.out.println("���ɮת�������|:"+file.getCanonicalPath());
  System.out.println("���ɮשҦb���ؿ��O:"+file.getParent());
  System.out.println("���ɮת����|:"+file.getPath());
  //System.out.println("���ɮ�:"+file.getTotalSpace());
  //System.out.println("���ɮ�:"+file.getUsableSpace() );
  System.out.println("���ɮת��ק����O:"+new Date(file.lastModified()));
  System.out.println("���ɮת��W��:"+file.getName());
  System.out.println("���ɮ׬O�_�O������|:"+(file.isAbsolute()?"�O":"�_"));
  System.out.println("��test.txt�ɮ׬O:"+(file.isDirectory()?"�O�ؿ�":(file.isFile()?"�O�ɮ�":"���O�ؿ��]���O�ɮ�")));
  System.out.println("���ɮ׬O:"+(file.isHidden()?"����":"���O����"));
  System.out.println("���ɮת����׬O:"+file.length());
  file.deleteOnExit();
  System.out.println(file.delete()?"�R�����\":"�R������");
  File directorys=new File("abc\\def\\ggg");
  System.out.println("abc\\def\\ggg���ؿ�:"+(directorys.mkdirs()?"�إߦ��\":"�إߥ���"));
  File directory=new File("kkk");
  System.out.println("kkk���ؿ�:"+(directory.mkdir()?"�إߦ��\":"�إߥ���"));
  File file1=new File(directory,"test.txt");
  System.out.println("abc\\def\\ggg���ؿ��U��test.txt:"+(file1.createNewFile()?"�إߦ��\":"�إߥ���"));
  File file2=new File(directorys,"test.txt");
  System.out.println("kkk���ؿ��U��test.txt:"+(file2.createNewFile()?"�إߦ��\":"�إߥ���")); 
  
  
 }		
}	