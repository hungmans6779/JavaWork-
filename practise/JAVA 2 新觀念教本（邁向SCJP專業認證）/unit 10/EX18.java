import java.util.regex.*;
public class EX18
{
 public static void main(String argv[])
 {
  String input="b be beach bead beaker "+"bean bee being abbey abet";
  String pattern="\\bbe\\b";
  if(argv.length>0)
  {
   pattern=argv[0];	
  }	
  Pattern p=Pattern.compile(pattern);
  Matcher m=p.matcher(input);
  System.out.println(input);
  while(m.find())
  {
   for(int i=0;i<m.start();i++)
   {
   	System.out.print(" ");
   }		
   for(int i=0;i<m.group().length();i++)
   {
    System.out.print("^");	
   }
   System.out.println("");
  }	
 }
}