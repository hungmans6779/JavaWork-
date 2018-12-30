public class StringTest21
{
 public static void main(String argv[])
 {
  String str="a1b2c3";
  String data[]=str.split("\\d");
  for(String d:data)
   System.out.println(d);
 }
}