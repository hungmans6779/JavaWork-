import java.util.regex.*;
public class PatternTest4
{
 public static void main(String argv[])
 {
 	String [] token1,token2,token3;
  Pattern ptn=Pattern.compile("[:/.]+");
  token1=ptn.split("http://www.yahoo.com.tw");
  for(String data:token1)
   System.out.println(data);	
  System.out.println("-------------------------------");
  
  token2=ptn.split("http://www.yahoo.com.tw",2);
  for(String data:token2)
   System.out.println(data);
  System.out.println("-------------------------------");
   
  token3=ptn.split("http://www.yahoo.com.tw",100);
  for(String data:token3)
   System.out.println(data); 
 }
}