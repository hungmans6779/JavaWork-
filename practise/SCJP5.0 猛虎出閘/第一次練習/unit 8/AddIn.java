import java.io.*;
public class AddIn implements Serializable
{
 public static final long serialVersionUID=1;	
 private int sum=0;
 
 public void calc(int ... value)
 {
  for(int data:value)
  {
   sum+=data;
  }
 }
 
 public int getSum()
 {
  return sum;
 }
}