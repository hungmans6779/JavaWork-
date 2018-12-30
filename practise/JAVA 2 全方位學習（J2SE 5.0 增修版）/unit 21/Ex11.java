import java.io.*;
public class Ex1
{
 static FileInputStream fIn;	
 static FileOutputStream fOut;
 public static void main(String argv[])
 {
 
  byte data[]=new byte[4096];
  int i,count=1;
  
  //f1用來判斷目前要拷貝的檔案的路徑
  File f1=new File(argv[0]);   
  //f2用來判斷目前程式所執行的目錄路徑
  File f2=new File(System.getProperty("user.dir"));
  
  //strp1確定目前要拷貝的檔案的路徑
  String strp1=f1.getAbsolutePath();
  //strp1確定目前程式所執行的目錄路徑
  String strp2=f2.getPath()+"\\"+f1.getName();
 

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
     	System.out.println("test1");
     	try
     	{
     	 	fOut=new FileOutputStream(argv[1]);
     	 	System.out.println("test3");
     	 	
     	}
     	catch(ArrayIndexOutOfBoundsException npe)
     	{
       System.out.println("test4");
     	 fOut=new FileOutputStream(f1.getName());	
     	}		
     	finally
     	{
     		System.out.println("test5");
     	
     	}	
      
 	   }
 	   else
 	   {
 	   	System.out.println("test2");
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
}	