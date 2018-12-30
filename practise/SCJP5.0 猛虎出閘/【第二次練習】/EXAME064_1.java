import java.util.*;
public class EXAME064_1
{
 public static void main(String argv[])
 {
  ArrayList strings=new ArrayList();
  strings.add("aAaA");
  strings.add("AaA");
  strings.add("aAa");
  strings.add("AAaa");
  Collections.sort(strings);
  for(Object s:strings)
  {
   System.out.print(s+"\t");	
  }	
 }
}