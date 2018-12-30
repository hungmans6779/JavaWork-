public class Boolean1
{
 public static void main(String argv[])
 {
  System.out.println(Boolean.valueOf("true"));
  System.out.println(Boolean.valueOf("true").booleanValue());
  System.out.println(Boolean.getBoolean("true"));
  boolean b=Boolean.getBoolean("false");
  System.out.println(b);
  String str=Boolean.toString(true);
  System.out.println(str);
 }
}