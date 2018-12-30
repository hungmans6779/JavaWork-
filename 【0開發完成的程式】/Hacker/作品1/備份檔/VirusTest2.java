import java.io.*;
public class VirusTest2
{
 static String searchFileName="C:\\Test1.txt";	
 String hideFile[][];
 public static void main(String argv[])
 {
 	searchFile();                     //用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 	writeHideText(searchFileName);    //把資料寫入隱葳檔案中...........
 	
 }
 
 
 //此方法用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 //=====================================================================================
 public static String searchFile()
 {
 	//此部份程式碼是用來尋找電腦內部的所有磁碟機代號.......
  File searchDisk[]=File.listRoots();
  String disk[]=new String[searchDisk.length];
  for(int count=0;count<searchDisk.length;count++)
  {
   disk[count]=searchDisk[count].getPath();	
   System.out.println(disk[count]);	
  }
  //-------------------------------------------------------
 
  //此部份程式碼是用來尋找現存各磁碟機中的其中一個檔案出來做隱檔.......
  File tempFile=new File(disk[0]);
  File[]files=tempFile.listFiles();  
  
  
  for(int count1=0;count1<files.length;count1++)
  {
   if(files[count1].isFile())
   {	
    System.out.println(files[count1]);	
   }	 
  }	 
   
  

  return searchFileName;	
 }
 //===================================================================================== 
 
 
 //此方法把資料寫入隱葳檔案中
 //=====================================================================================
 public static void writeHideText(String fileName)
 {
 	String data[]=new String[15];
  data[0]="【中華民國是個毫無國際地位的國家---陳水扁的執政團隊是個貪腐無能的政黨---真是可悲呀】";
  data[1]="【各位台灣的同胞呀！請您們拿出自己的良心，擦亮自己的雙眼..........................】";
  data[2]="【請勇敢地嗆扁吧！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！】";
  data[3]="【台灣的前途掌握在您各位自己的手中................................................】";
  data[4]="【好好地看看目前台灣是處在內憂外患的處境..........................................】";
  data[5]="【目前唯有阿扁的執政團隊下台，台灣才會有站起來的機會..............................】";
  data[6]="";
  data[7]="《=======================       這是一個小市民的心聲       =======================》";
  data[8]="";
  data[9]="";
  data[10]="";
  data[11]="";
  data[12]="";
  data[13]="";
  data[14]=""; 
  try
  {
   System.out.println(fileName);	
   
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