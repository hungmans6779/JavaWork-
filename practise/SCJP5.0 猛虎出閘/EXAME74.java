import java.util.*;
public class EXAME74
{
 public static void main(String argv[])
 {
 	new EXAME74().getNumbers();
 }
 public void getNumbers()
 {
  ArrayList numbers=new ArrayList();
  for(int i=0;i<10;i++)
  {
   int value=i*(int)(Math.random());
   Integer intObj=new Integer(value);
   numbers.add(intObj);	
  }
  System.out.println(numbers);		
 }
 public void finalize()
 {
 	System.out.println("啟動資源回收了");
 }	
}