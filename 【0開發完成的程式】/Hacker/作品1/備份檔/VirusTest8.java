//�������P7���\��A�u�O��ڥؿ��U�S���ɮת��{���X�t�~�g���@�Ӥ�k�h�I�s................
import java.io.*;
public class VirusTest8
{
 static String searchFileName="C:\\Test1.txt";	
 String hideFile[][];
 int diskFileCount[];
 File[] files;
 public static void main(String argv[])
 {
 	VirusTest8 v=new VirusTest8();
 	v.searchFile();                 //�ΨӴM��X�w�Ф��i�H�ΨӳQ�g�J���ä���ɮ�
 	v.showHideFiles();              //��U�Ϻо����i�H���ê��ɮצC�X��
 	writeHideText(searchFileName);  //���Ƽg�J��߻�ɮפ�........... 	
 	  
 }
 
 
 //����k�ΨӴM��X�w�Ф��i�H�ΨӳQ�g�J���ä���ɮ�
 //=====================================================================================
 public  void searchFile()
 {
  //------------------------------------------------------------------------------
 	//�������{���X�O�ΨӴM��q���������Ҧ��Ϻо��N��.......
  File searchDisk[]=File.listRoots();
  String disk[]=new String[searchDisk.length];
 
  for(int count=0;count<searchDisk.length;count++)
  {
   disk[count]=searchDisk[count].getPath();	
   //System.out.println(disk[count]);	
  }
  //------------------------------------------------------------------------------
   
   hideFile=new String[disk.length][];
   diskFileCount=new int[disk.length];  
 
  //------------------------------------------------------------------------------
  //�������{���X�O�ΨӴM��{�s�U�Ϻо��ڥؿ��U���ɮץX��.......
  for(int diskcount=0;diskcount<disk.length;diskcount++)
  {
   File tempFile=new File(disk[diskcount]);
   files=tempFile.listFiles();     
   int countFile=0;
    
   //�������O�nŪ���X���C�@�ӺϺо��ڥؿ��U�����TFile �ƥ�............
   for(int filecount=0;filecount<files.length;filecount++)
   {	
    //***************************************************************************	
    //�������O�Ψ�Ū���C�ӺϺо��ڥؿ��U���ɮ׼ƶq
    if(files[filecount].isFile())
    {	countFile++; }	 
    //***************************************************************************
   }	
    
   diskFileCount[diskcount]=countFile;
   hideFile[diskcount]=new String[countFile];
   System.out.println("countFile="+diskFileCount[diskcount]); 
   int j=0;
   for(int i=0;i<files.length;i++)
   {
    if(files[i].isFile())
    {
     hideFile[diskcount][j]=files[i].getPath();	
     // System.out.println(hideFile[diskcount][j]);
     j++;
    }		
   }
     
   //***************************************************************************
   //�������O�P�_��o�{�ڥؿ��S���ɮץi�H�����˪��ɮ׮ɡI�h���U�@�h�ؿ��M���ɮ�
   if(countFile==0)
   {  
   	rootNoFiles(diskcount);
   }	
   //*************************************************************************** 	
  } 
 //------------------------------------------------------------------------------ 
 }
 //===================================================================================== 
 
 
 
 //===================================================================================== 
 //����k�O��o�{�ڥؿ��S���ɮץi�H�����˪��ɮ׮ɡI�h���U�@�h�ؿ��M���ɮ�
 public  void rootNoFiles(int diskcount)
 {
  //�������O��o�{�ڥؿ��S���ɮץi�H�����˪��ɮ׮ɡI�h���U�@�h�ؿ��M���ɮ�
  //System.out.println(disk[diskcount]);
  String fileDirectory=files[0].getPath();	
  //System.out.println(fileDirectory);		
  File rootFileNext=new File(files[0].getPath());
  File [] nextFile=rootFileNext.listFiles();
  int nextCount=0;
  for(int i=0;i<nextFile.length;i++)
  {
   if(nextFile[i].isFile())
  	{ nextCount++; }	
 	}	
	//System.out.println("nextFile="+nextCount);
 	hideFile[diskcount]=new String[nextCount];
 	int ok=0;
 	for(int i=0;i<nextFile.length;i++)
 	{
   if(nextFile[i].isFile())
   {
   	hideFile[diskcount][ok]=nextFile[i].getPath();
    ok++;
   }
   //System.out.println(nextFile[i]);		
  }   	
 }	
 
 //===================================================================================== 
 //���k�O��U�Ϻо����i�H���ê��ɮצC�X��
 public void showHideFiles()
 {
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
 }
 //===================================================================================== 


 //===================================================================================== 
 //����k���Ƽg�J��߻�ɮפ�
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