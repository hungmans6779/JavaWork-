public class EXAME036
{
 public static void main(String argv[])
 {
  String str1=System.getProperty("prop.custom");
  String str2=System.getProperties().getProperty("prop.custom");
  System.out.println("str1 = "+str1);
  System.out.println("str2 = "+str2); 
 }
}