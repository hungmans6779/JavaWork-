 import java.io.*;
 public class Ex10_1
 {
  static int inputValue=0; 
  public static void main(String argv[])
  {
    inputValue=Integer.parseInt(argv[0]); 
    Runtime rt=Runtime.getRuntime();

    System.out.println("===============================================================");
    System.out.println("產生陣列a[]前的Free/Total Memory："+rt.freeMemory()+"/"+rt.totalMemory());
    long first=rt.freeMemory();
    int a[]=new int[inputValue];
    for (int j=0;j<inputValue;j++)
    {
     a[j]=j;
     System.out.println("陣列a["+j+"]="+j); 
    }  
     long last=rt.freeMemory();
     long resultValue=first-last;
     System.out.println("\n產生陣列a[]後的Free/Total Memory："+rt.freeMemory()+"/"+rt.totalMemory());
     System.out.println("其a[]所用的記憶體前後相差值為 "+resultValue);
      for(int clr=0;clr<inputValue;clr++)
     { 
       a[clr]=0;
     }	
     System.gc();
     // Runtime.getRuntime().gc();
    System.out.println("===============================================================");   
   
   
    
    
    System.out.println("===============================================================");  
    System.out.println("產生陣列MyObjcect類別的obj[]前Free/Total Memory："+rt.freeMemory()+"/"+rt.totalMemory());
    first=rt.freeMemory();
    MyObject obj[]=new  MyObject[inputValue];
    for (int j=0;j<inputValue;j++)
    {
     obj[j]=new MyObject(j);
     System.out.println("物件obj["+j+"]="+obj[j].data);
    }
     last=rt.freeMemory();
     resultValue=first-last;
     System.out.println("\n產生陣列MyObjcect類別的obj[]後的Free/Total Memory："+rt.freeMemory()+"/"+rt.totalMemory());
     System.out.println("其a[]所用的記憶體前後相差值為 "+resultValue);
     for(int clr=0;clr<inputValue;clr++)
     { 
      obj[clr]=null;
     }	
     System.gc();
     System.out.println("==============================================================="); 
  } 
 }