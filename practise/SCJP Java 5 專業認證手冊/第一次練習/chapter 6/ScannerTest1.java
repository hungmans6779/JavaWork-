import java.util.*;
public class ScannerTest1
{
 public static void main(String argv[])
 {
 	String str="";	
  Scanner s1=new Scanner("1 true 34 hi");
  Scanner s2=new Scanner("1 true 34 hi");
  while(s1.hasNext())
  {
   s1.next();
   str+="s";	
  }	
  while(s2.hasNext())
  {
   if(s2.hasNextInt())
   {
   	s2.nextInt();
   	str+="i";
   }		
   else if(s2.hasNextBoolean())
   {
   	s2.nextBoolean();
   	str+="b";
   }
   else
   {
   	s2.next();
   	str+="s";
   }	
  }	 
  System.out.println("str : "+str);	
 }
}