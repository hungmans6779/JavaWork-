public class WrapperTest1_7
{
 public static void main(String argv[])
 {
  Double d1=new Double("3.14");
  System.out.println("d1="+d1.toString());
  System.out.println("¶ê©P²v "+d1.toString());
  String str1=Long.toString(353,16);
  System.out.println("str1="+str1);
  String str2=Double.toString(4545.45);
  System.out.println("str2="+str2);
 }
}