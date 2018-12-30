import java.io.*;
public class AddInTest2 implements Serializable
{
 public static final long serialVersionUID=1;	
 private transient int sum=0;
 
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