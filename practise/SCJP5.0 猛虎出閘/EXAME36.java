public class EXAME36
{
 public static void main(String argv[])
 {
  String str=System.getProperty("prop.custom");
  System.out.println("str = "+str);
  String str1=System.getProperties().getProperty("prop.custom");
  System.out.println("str1 = "+str1);
 }
}