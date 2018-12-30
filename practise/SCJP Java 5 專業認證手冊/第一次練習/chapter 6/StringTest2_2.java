public class StringTest2_2
{
 public static void main(String argv[])
 {
  String s1="Spring";
  String s2=s1+" Sumer";
  s1.concat("fall");
  s2.concat(s1);
  s1+=" winter";
  System.out.println(s1+ "  "+s2);
 
 }
}