import java.io.*;
public class FileTest4
{
 public static void main(String argv[])
 {
 	try
 	{
   File delDir=new File("delDir");
   System.out.println("delDir�O�_�Q�إ� : "+delDir.mkdir());
   System.out.println("delDir�O�_���ؿ� : "+delDir.isDirectory());
   File newFile1=new File(delDir,"newFile1.txt");
   System.out.println("newFile1.txt �O�_�Q�إ� : "+newFile1.createNewFile());
   File newFile2=new File(delDir,"newFile2.txt");
   System.out.println("newFile2.txt �O�_�Q�إ� : "+newFile2.createNewFile());
   System.out.println("newFile2.txt �O�_�Q�R�� : "+newFile2.delete());
   System.out.println("delDir �ؿ��O�_�Q�R���F : "+delDir.delete());
   File rename=new File(delDir,"�ڬO��.txt");
   System.out.println("newFile1.txt�O�_�Q��W��<<�ڬO��.txt>> : "+newFile1.renameTo(rename));
   File renameDir=new File("�ͧڤ��ɧڬO�֡A�ͧڤ��e�֬O��");
   System.out.println("delDir �ؿ��O�_�Q��W��<<�ͧڤ��ɧڬO�֡A�ͧڤ��e�֬O��>> : "+delDir.renameTo(renameDir));
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }	 
 }
}