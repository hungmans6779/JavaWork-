import java.util.*;
public class EXAME064
{
 public static void main(String argv[])
 {
  ArrayList<String>strings=new ArrayList<String>();
  strings.add("aAaA");
  strings.add("AaA");
  strings.add("aAa");
  strings.add("AAaa");
  Collections.sort(strings);
  for(String s:strings)
  {
   System.out.print(s+"\t");	
  }	
 }
}