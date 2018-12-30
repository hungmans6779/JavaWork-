import java.io.*;
class AddInt implements Serializable
{
 public static void main(String argv[])
 {
  
 }
 private static final long serialVersionUID=1;
 private int sum=0;
 public void calc(int...c)
 {
  for(int i=0;i<c.length;i++)
  {
   sum+=c[i];	
  }		
 }	
 public int getSum()
 {
 	return sum;
 }	
}

public class ObjectOutputStreamTest1
{
 public static void main(String argv[])
 {
  new ObjectOutputStreamTest1().write();
 }
 public void write()
 {
 	AddInt ai=new AddInt();
 	ai.calc(1,2,3,4);
  try
  {
   FileOutputStream fos=new FileOutputStream("IntBean.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(ai);
   System.out.println("資料已成功序列化並寫入\"IntBean.scr\"的檔案中");
   oos.close();
   fos.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }			
  finally
  {
   System.out.println("謝謝使用本程式");	
  }
 }	
}