public class StringSplitTest1
{
 public static void main(String argv[])
 {
  String str="http://vincentjava.idv.tw";
  String [] new_str=str.split("[:/]+");
  for(String token:new_str)
  {
   System.out.println(token);
  }
 }
}