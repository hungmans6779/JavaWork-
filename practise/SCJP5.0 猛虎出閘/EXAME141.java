public class EXAME141
{
 public static void main(String argv[])
 {
  String test="a1b2c3";
  String[]s=test.split("\\d");
  for(String ss:s)
  {
   System.out.print(ss+"  ");	
  }	
 }
}