import java.io.*;
public class Ex1
{
 static FileInputStream fIn;	
 static FileOutputStream fOut;
 static File f1;
 static File f2;
 static String strp1,strp2;
 public static void main(String argv[])
 {
  Author.showAuthor();
  System.out.println("\n\n\n");
  byte data[]=new byte[4096];
  int i,count=1;
  
  try
  {
   //f1用來判斷目前要拷貝的檔案的路徑
   f1=new File(argv[0]);   
   //f2用來判斷目前程式所執行的目錄路徑
   f2=new File(System.getProperty("user.dir"));
  
   //strp1確定目前要拷貝的檔案的路徑
   strp1=f1.getAbsolutePath();
   //strp1確定目前程式所執行的目錄路徑
   strp2=f2.getPath()+"\\"+f1.getName();
   
   if(!f1.exists())	
   {
    System.out.println("系統找不到指定的檔案。");
   } 
   
   //有找到檔案，則執行迴圈內的程式碼
   while(f1.exists() && count==1)
   {
    count++;	
    try
    {
     fIn=new FileInputStream(argv[0]);
     try
     {   	
      if(!strp1.equals(strp2))
      {	
       try
       {
     	 	fOut=new FileOutputStream(argv[1]);
	 	   }
     	 catch(ArrayIndexOutOfBoundsException npe)
       {
     	  fOut=new FileOutputStream(f1.getName());	
       }		   
 	    }
 	    else
 	    {
 	     fOut=new FileOutputStream(argv[1]);
 	    }	 
 	    i=fIn.read(data);
      while(i==4096)
      {
       fOut.write(data);
       i=fIn.read(data);
      }	
      fOut.write(data,0,i);
      System.out.println("複製了        1 個檔案。"); 
      fIn.close();
      fOut.close();
     }
     catch(ArrayIndexOutOfBoundsException aio)
 	   {
 	  	System.out.println("檔案不可複製到檔案本身。");
    	System.out.println("複製了        0 個檔案。"); 
 	   }	 
 	  } 
    catch(IOException ioe)
    {
     System.out.println("檔案不可複製到檔案本身。"); 
     System.out.println("複製了        0 個檔案。"); 
    }	 
   }  	 
  }
  catch(ArrayIndexOutOfBoundsException aioo)
  {
   System.out.println("命令語法不正確。");	
  }	 
 }		
}	