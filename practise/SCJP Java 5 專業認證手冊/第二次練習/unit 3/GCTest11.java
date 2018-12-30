import java.util.*;
public class GCTest11
{
 static int count=0;
 static int countGC=0;
 GCTest11()
 {
 	System.out.println(Thread.currentThread().getName()+" 被建立了: "+ (++count)+" 次...");
 }		
 public static void main(String argv[])
 {
  Runtime rt=Runtime.getRuntime();
  System.out.println("Total Memory: "+rt.totalMemory()+" bytes.");
  System.out.println("Before Memory: "+rt.freeMemory()+" bytes.");
  for(int i=0;i<10;i++)
  {
   GCTest11 d=new GCTest11();
   d=null;	
  }	
  System.out.println("After Memory: "+rt.freeMemory()+" bytes.");
  System.out.println("==============================");
  rt.gc();
  System.out.println("After GC Memory: "+rt.freeMemory()+" bytes.");
 }
 protected void finalize() throws Throwable
 {
 	System.out.println(Thread.currentThread().getName()+" 被釋放了第 "+ (++countGC)+" 次...");
 }	
}