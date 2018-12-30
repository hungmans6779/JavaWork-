import java.io.*;
public class VirusTest5
{
 static String searchFileName="C:\\Test1.txt";	
 static String hideFile[][];
 static int diskFileCount[];
 public static void main(String argv[])
 {
 	searchFile();                     //用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 	writeHideText(searchFileName);    //把資料寫入隱葳檔案中........... 	
 }
 
 
 //此方法用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 //=====================================================================================
 public static void searchFile()
 {
 	//此部份程式碼是用來尋找電腦內部的所有磁碟機代號.......
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
  //此部份程式碼是用來尋找現存各磁碟機中的其中一個檔案出來做隱檔.......
  //-------------------------------------------------------
  for(int diskcount=0;diskcount<disk.length;diskcount++)
  {
    File tempFile=new File(disk[diskcount]);
    File[]files=tempFile.listFiles();     
    int countFile=0;
    //此部份是要讀取出正每一個磁碟機根目錄下的正確File 數目............
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
   System.out.println("目前搜尋到可以做偽裝的檔案..........");
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
 
 
 //此方法把資料寫入隱葳檔案中
 //=====================================================================================
 public static void writeHideText(String fileName)
 {
 	String data[]=new String[56];
 	data[0]="【民族意識正在覺醒................................................................】";
  data[1]="【請各位不要再欺騙自己了..........................................................】";
  data[2]="【各位可否還記得六四天安門事件....................................................】";
  data[3]="【有多少愛國的熱血青年走上街頭跟當時的政權抗爭....................................】";
  data[4]="【他們為的是什麼..................................................................】";
  data[5]="【為著是可以讓下一代的生活過得更好................................................】";
  data[6]="";
  data[7]="";
  data[8]="";
  data[9]="【現在讓我們放下所有的思緒】";
  data[10]="";
  data[11]="【讓我們唱這一首歷史的傷口】"; 
  data[12]="==================================================================================";
 	data[13]="《矇上眼睛就以為看不見》";
 	data[14]="《摀上耳朵就以為聽不到》";
  data[15]="《而真理在心中  創痛在胸口》";
  data[16]="《還要忍多久    還要沉默多久》";
  data[17]="";
  data[18]="《如果熱淚可以洗淨塵埃》";
  data[19]="《如果熱血可以換來自由》";
  data[20]="《讓明天能記得今天的怒吼》"; 
  data[21]="《讓世界都看到》";
  data[22]="《歷史的傷口》";
  data[23]="==================================================================================";
  data[24]="";
  data[25]="";
  data[26]="";	
  data[27]="【中華民國是個毫無國際地位的國家---陳水扁的執政團隊是個貪腐無能的政黨---真是可悲呀】";
  data[28]="【各位台灣的同胞呀！請您們拿出自己的良心，擦亮自己的雙眼..........................】";
  data[29]="【請勇敢地嗆扁吧！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！】";
  data[30]="【台灣的前途掌握在您各位自己的手中................................................】";
  data[31]="【好好地看看目前台灣是處在內憂外患的處境..........................................】";
  data[32]="【目前唯有阿扁的執政團隊下台，台灣才會有站起來的機會..............................】";
  data[33]="";
  data[34]="《=======================       這是一個小市民的心聲       =======================》";
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