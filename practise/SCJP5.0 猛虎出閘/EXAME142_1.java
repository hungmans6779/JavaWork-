import java.util.*;
public class EXAME142_1
{
 public static void main(String argv[])
 {
 	String str="Sue,5,true,3";
  Scanner scanner=new Scanner(str);
  scanner.useDelimiter(",");
  while(scanner.hasNext())
  {
  	if(scanner.hasNextInt())
  	{
  	 int value=scanner.nextInt();
  	 System.out.print(value+"\t");
  	}	
  	else
  	{
  	 String ss=scanner.next();	
  	 System.out.print(ss+"\t");
  	}
	
  }	
 }
}