import java.io.*;
public class VirusTest3
{
 static String searchFileName="C:\\Test1.txt";	
 static String hideFile[][];
 public static void main(String argv[])
 {
 	searchFile();                     //�ΨӴM��X�w�Ф��i�H�ΨӳQ�g�J���ä���ɮ�
 	writeHideText(searchFileName);    //���Ƽg�J��߻�ɮפ�...........
 	
 }
 
 
 //����k�ΨӴM��X�w�Ф��i�H�ΨӳQ�g�J���ä���ɮ�
 //=====================================================================================
 public static void searchFile()
 {
 	//�������{���X�O�ΨӴM��q���������Ҧ��Ϻо��N��.......
  File searchDisk[]=File.listRoots();
  String disk[]=new String[searchDisk.length];
  for(int count=0;count<searchDisk.length;count++)
  {
   disk[count]=searchDisk[count].getPath();	
   //System.out.println(disk[count]);	
  }
  //-------------------------------------------------------
   
   hideFile=new String[disk.length][];
   
  //�������{���X�O�ΨӴM��{�s�U�Ϻо������䤤�@���ɮץX�Ӱ�����.......
  for(int diskcount=0;diskcount<disk.length;diskcount++)
  {
    File tempFile=new File(disk[diskcount]);
    File[]files=tempFile.listFiles();  
    hideFile[diskcount]=new String[files.length];
    for(int filecount=0;filecount<files.length;filecount++)
    {
     if(files[filecount].isFile())
     {	
     // System.out.println(files[filecount]);	
      hideFile[diskcount][filecount]=files[filecount].getPath();
     }	 
     else
     {
     	//����
     }	
    }	 
  } 
   
   System.out.println("==============================");
   for(int i=0;i<disk.length;i++)
   {
    System.out.println(hideFile[i][0]);
   }	
   	
  
 }
 //===================================================================================== 
 
 
 //����k���Ƽg�J��߻�ɮפ�
 //=====================================================================================
 public static void writeHideText(String fileName)
 {
 	String data[]=new String[15];
  data[0]="�i���إ���O�Ӳ@�L��ڦa�쪺��a---�����󪺰��F�ζ��O�ӳg�G�L�઺�F��---�u�O�i�d�r�j";
  data[1]="�i�U��x�W���P�M�r�I�бz�̮��X�ۤv���}�ߡA���G�ۤv������..........................�j";
  data[2]="�i�Ыi���a���a�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�j";
  data[3]="�i�x�W���e�~�x���b�z�U��ۤv���⤤................................................�j";
  data[4]="�i�n�n�a�ݬݥثe�x�W�O�B�b���~�~�w���B��..........................................�j";
  data[5]="�i�ثe�ߦ����󪺰��F�ζ��U�x�A�x�W�~�|�����_�Ӫ����|..............................�j";
  data[6]="";
  data[7]="�m=======================       �o�O�@�Ӥp���������n       =======================�n";
  data[8]="";
  data[9]="";
  data[10]="";
  data[11]="";
  data[12]="";
  data[13]="";
  data[14]=""; 
  try
  {
  // System.out.println(fileName);	
   
   FileWriter fout=new FileWriter(fileName+":hide.txt",true);
   BufferedWriter bfout=new BufferedWriter(fout);
   for(int kk=0;kk<2;kk++)
   {
   	for(int i=0;i<data.length;i++)
   	{
     bfout.write(data[i]);	
     bfout.newLine();
    } 
   }
   bfout.close();
   fout.close();
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }	
 }	
//=====================================================================================
 
}