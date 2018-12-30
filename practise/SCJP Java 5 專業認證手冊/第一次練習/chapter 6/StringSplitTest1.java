public class StringSplitTest1
{
 public static void main(String argv[])
 {
  String str[]=argv[1].split(argv[0]);
  for(String s:str)
  {
   System.out.println(s);	
  }	
 }
}