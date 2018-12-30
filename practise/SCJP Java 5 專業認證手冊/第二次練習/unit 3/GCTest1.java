import java.util.*;
public class GCTest1
{
 public static void main(String argv[])
 {
  Runtime rt=Runtime.getRuntime();
  System.out.println("Total Memory: "+rt.totalMemory());
  System.out.println("Before Memory: "+rt.freeMemory());
  for(int i=0;i<1000;i++)
  {
   Date d=new Date();
   d=null;	
  }	
  System.out.println("After Memory: "+rt.freeMemory());
  //rt.gc();
  System.gc();
  System.out.println("After GC Memory: "+rt.freeMemory());
 }
}