public class Test1
{
 public static void main(String argv[])
 {
  String str="true";
  //boolean value=Boolean.valueOf(str).booleanValue();
  boolean value=Boolean.parseBoolean(str);
  System.out.println("value="+value);
 }
}