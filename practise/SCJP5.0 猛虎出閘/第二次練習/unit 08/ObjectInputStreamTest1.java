import java.io.*;
public class ObjectInputStreamTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fis=new FileInputStream("IntBean.ser");
   ObjectInputStream ois=new ObjectInputStream(fis);
   AddInt ai;
   ai=(AddInt)ois.readObject();
   System.out.println("\"IntBear.ser\"�ɮפw���\�ϧǦC�ƤF.....");
   if(ai!=null)
   {
   	System.out.println("sum:"+ai.getSum());
   }	
   else
   {
   	System.out.println("ai=null");
   }	
  }
  catch(Exception ioe)
  {
   ioe.printStackTrace();	
  }		
  finally
  {
   System.out.println("���¨ϥΥ��{��");	
  }	
 }
}