import java.util.*;
public class cTest6
{
 public static void main(String argv[])
 {
  Random rm=new Random();
  for(int i=0;i<=100;i++)
  {
   int num=rm.nextInt(25)+65;	
   System.out.print((char)num+"="+num+",");	
  }	
 }
}