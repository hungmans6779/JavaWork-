import java.io.*;
public class VirusTest5
{
 static String searchFileName="C:\\Test1.txt";	
 static String hideFile[][];
 static int diskFileCount[];
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
 	//-------------------------------------------------------
  File searchDisk[]=File.listRoots();
  String disk[]=new String[searchDisk.length];
 
  for(int count=0;count<searchDisk.length;count++)
  {
   disk[count]=searchDisk[count].getPath();	
   //System.out.println(disk[count]);	
  }
  //-------------------------------------------------------
   
   hideFile=new String[disk.length][];
   diskFileCount=new int[disk.length];  
  //�������{���X�O�ΨӴM��{�s�U�Ϻо������䤤�@���ɮץX�Ӱ�����.......
  //-------------------------------------------------------
  for(int diskcount=0;diskcount<disk.length;diskcount++)
  {
    File tempFile=new File(disk[diskcount]);
    File[]files=tempFile.listFiles();     
    int countFile=0;
    //�������O�nŪ���X���C�@�ӺϺо��ڥؿ��U�����TFile �ƥ�............
    for(int filecount=0;filecount<files.length;filecount++)
    {
     if(files[filecount].isFile())
     {	countFile++; }	 
    }	
    
    diskFileCount[diskcount]=countFile;
    hideFile[diskcount]=new String[countFile];
    //System.out.println("countFile="+diskFileCount[diskcount]); 
    
    for(int i=0;i<diskFileCount[diskcount];i++)
    {
     if(files[i]!=null)
     {
       hideFile[diskcount][i]=files[i].getPath();	
     }		
    }	
  } 
  //------------------------------------------------------- 
   System.out.println("====================================");
   System.out.println("�ثe�j�M��i�H�����˪��ɮ�..........");
   for(String []str:hideFile)
   {
   	for(String data:str)
   	{
   	 System.out.println(data);	
   	}	
   }	
   System.out.println("===================================="); 
   
   
   for(int i=0;i<disk.length;i++)
   {
  //  System.out.println(hideFile[i][0]);
   }	
   	
  
 }
 //===================================================================================== 
 
 
 //����k���Ƽg�J��߻�ɮפ�
 //=====================================================================================
 public static void writeHideText(String fileName)
 {
 	String data[]=new String[56];
 	data[0]="�i���ڷN�ѥ��bı��................................................................�j";
  data[1]="�i�ЦU�줣�n�A���F�ۤv�F..........................................................�j";
  data[2]="�i�U��i�_�ٰO�o���|�Ѧw���ƥ�....................................................�j";
  data[3]="�i���h�ַR�ꪺ����C�~���W���Y���ɪ��F�v�ܪ�....................................�j";
  data[4]="�i�L�̬����O����..................................................................�j";
  data[5]="�i���۬O�i�H���U�@�N���ͬ��L�o��n................................................�j";
  data[6]="";
  data[7]="";
  data[8]="";
  data[9]="�i�{�b���ڭ̩�U�Ҧ�������j";
  data[10]="";
  data[11]="�i���ڭ̰۳o�@�����v���ˤf�j"; 
  data[12]="==================================================================================";
 	data[13]="�mé�W�����N�H���ݤ����n";
 	data[14]="�mݳ�W�զ��N�H��ť����n";
  data[15]="�m�ӯu�z�b�ߤ�  �еh�b�ݤf�n";
  data[16]="�m�٭n�Ԧh�[    �٭n�I�q�h�[�n";
  data[17]="";
  data[18]="�m�p�G���\�i�H�~�b�ЮJ�n";
  data[19]="�m�p�G����i�H���Ӧۥѡn";
  data[20]="�m�����ѯ�O�o���Ѫ���q�n"; 
  data[21]="�m���@�ɳ��ݨ�n";
  data[22]="�m���v���ˤf�n";
  data[23]="==================================================================================";
  data[24]="";
  data[25]="";
  data[26]="";	
  data[27]="�i���إ���O�Ӳ@�L��ڦa�쪺��a---�����󪺰��F�ζ��O�ӳg�G�L�઺�F��---�u�O�i�d�r�j";
  data[28]="�i�U��x�W���P�M�r�I�бz�̮��X�ۤv���}�ߡA���G�ۤv������..........................�j";
  data[29]="�i�Ыi���a���a�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�j";
  data[30]="�i�x�W���e�~�x���b�z�U��ۤv���⤤................................................�j";
  data[31]="�i�n�n�a�ݬݥثe�x�W�O�B�b���~�~�w���B��..........................................�j";
  data[32]="�i�ثe�ߦ����󪺰��F�ζ��U�x�A�x�W�~�|�����_�Ӫ����|..............................�j";
  data[33]="";
  data[34]="�m=======================       �o�O�@�Ӥp���������n       =======================�n";
  data[35]="";
  data[36]="";
  data[37]="";
  data[38]="";
  data[39]="";
  data[40]="";
  data[41]=""; 
  data[42]="";
  data[43]="";
  data[44]="";
  data[45]="";
  data[46]="";
  data[47]="";
  data[48]=""; 
  data[49]="";
  data[50]="";
  data[51]="";
  data[52]="";
  data[53]="";
  data[54]="";
  data[55]=""; 
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