 import java.io.*;
 public class Ex10_1
 {
  static int inputValue=0; 
  public static void main(String argv[])
  {
    inputValue=Integer.parseInt(argv[0]); 
    Runtime rt=Runtime.getRuntime();

    System.out.println("===============================================================");
    System.out.println("���Ͱ}�Ca[]�e��Free/Total Memory�G"+rt.freeMemory()+"/"+rt.totalMemory());
    long first=rt.freeMemory();
    int a[]=new int[inputValue];
    for (int j=0;j<inputValue;j++)
    {
     a[j]=j;
     System.out.println("�}�Ca["+j+"]="+j); 
    }  
     long last=rt.freeMemory();
     long resultValue=first-last;
     System.out.println("\n���Ͱ}�Ca[]�᪺Free/Total Memory�G"+rt.freeMemory()+"/"+rt.totalMemory());
     System.out.println("��a[]�ҥΪ��O����e��ۮt�Ȭ� "+resultValue);
      for(int clr=0;clr<inputValue;clr++)
     { 
       a[clr]=0;
     }	
     System.gc();
     // Runtime.getRuntime().gc();
    System.out.println("===============================================================");   
   
   
    
    
    System.out.println("===============================================================");  
    System.out.println("���Ͱ}�CMyObjcect���O��obj[]�eFree/Total Memory�G"+rt.freeMemory()+"/"+rt.totalMemory());
    first=rt.freeMemory();
    MyObject obj[]=new  MyObject[inputValue];
    for (int j=0;j<inputValue;j++)
    {
     obj[j]=new MyObject(j);
     System.out.println("����obj["+j+"]="+obj[j].data);
    }
     last=rt.freeMemory();
     resultValue=first-last;
     System.out.println("\n���Ͱ}�CMyObjcect���O��obj[]�᪺Free/Total Memory�G"+rt.freeMemory()+"/"+rt.totalMemory());
     System.out.println("��a[]�ҥΪ��O����e��ۮt�Ȭ� "+resultValue);
     for(int clr=0;clr<inputValue;clr++)
     { 
      obj[clr]=null;
     }	
     System.gc();
     System.out.println("==============================================================="); 
  } 
 }