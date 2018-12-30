 public class EXAME3
{
 public static void main(String argv[])
 {
  String test="This is a test";
  String str[]=test.split("\\w");
  System.out.println(str.length);
  for(String s:str)
  { System.out.print(s+"\t"); }
 }
}