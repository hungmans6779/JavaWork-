public class StringTest2
{
 public static void main(String argv[])
 {
  String str="http://www.yahoo.com.tw";
  String data[]=str.split("[:/.]+");
  for(String d:data)
   System.out.println(d);
 }
}