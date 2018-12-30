public class StringSplitTest2
{
 public static void main(String argv[])
 {
  String str="a1b2c3";
  String s[]=str.split("\\d");
  for(String ns:s)
  {
   System.out.print(ns+"\t");
  }
 }
}