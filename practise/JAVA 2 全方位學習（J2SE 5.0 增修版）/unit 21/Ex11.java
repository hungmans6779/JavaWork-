import java.io.*;
public class Ex1
{
 static FileInputStream fIn;	
 static FileOutputStream fOut;
 public static void main(String argv[])
 {
 
  byte data[]=new byte[4096];
  int i,count=1;
  
  //f1�ΨӧP�_�ثe�n�������ɮת����|
  File f1=new File(argv[0]);   
  //f2�ΨӧP�_�ثe�{���Ұ��檺�ؿ����|
  File f2=new File(System.getProperty("user.dir"));
  
  //strp1�T�w�ثe�n�������ɮת����|
  String strp1=f1.getAbsolutePath();
  //strp1�T�w�ثe�{���Ұ��檺�ؿ����|
  String strp2=f2.getPath()+"\\"+f1.getName();
 

  if(!f1.exists())	
  {
   System.out.println("�t�Χ䤣����w���ɮסC");
  } 
  //������ɮסA�h����j�餺���{���X
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
     System.out.println("�ƻs�F        1 ���ɮסC"); 
     fIn.close();
     fOut.close();
    }
    catch(ArrayIndexOutOfBoundsException aio)
 	  {
 	  	System.out.println("�ɮפ��i�ƻs���ɮץ����C");
    	System.out.println("�ƻs�F        0 ���ɮסC"); 
 	  }	 
 	 } 
   catch(IOException ioe)
   {
    System.out.println("�ɮפ��i�ƻs���ɮץ����C"); 
    System.out.println("�ƻs�F        0 ���ɮסC"); 
   }	 
  }  	
 }		
}	