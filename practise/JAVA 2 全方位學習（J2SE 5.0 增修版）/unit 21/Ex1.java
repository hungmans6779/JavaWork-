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
   //f1�ΨӧP�_�ثe�n�������ɮת����|
   f1=new File(argv[0]);   
   //f2�ΨӧP�_�ثe�{���Ұ��檺�ؿ����|
   f2=new File(System.getProperty("user.dir"));
  
   //strp1�T�w�ثe�n�������ɮת����|
   strp1=f1.getAbsolutePath();
   //strp1�T�w�ثe�{���Ұ��檺�ؿ����|
   strp2=f2.getPath()+"\\"+f1.getName();
   
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
  catch(ArrayIndexOutOfBoundsException aioo)
  {
   System.out.println("�R�O�y�k�����T�C");	
  }	 
 }		
}	