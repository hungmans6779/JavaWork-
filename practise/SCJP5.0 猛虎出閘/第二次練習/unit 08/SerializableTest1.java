import java.io.*;
public class SerializableTest1 implements Serializable
{
 public static void main(String argv[])
 {
  
 }
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