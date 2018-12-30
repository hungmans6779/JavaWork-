import java.util.regex.*;
public class PatternTest3
{
 public static void main(String argv[])
 {
 	String str="How many cake could a good cook cook "+
 	           "If a good cook could cook cake ?"+
 	           "good cook could cook as much cake "+
 	           "as a good cook who could cook cook. ";
  Pattern	pn=Pattern.compile("cake",Pattern.CASE_INSENSITIVE);
  Matcher mc=pn.matcher(str);
  String new_str=mc.replaceAll("pise");
  System.out.println(new_str);
 }	
}