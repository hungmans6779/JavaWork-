public class ReassigningAReferenceVariableTest1
{
 public static void main(String argv[])
 {
  String str1=new String("Java");
  String str2=new String("SCJP");
  System.out.println(str1);
  System.out.println(str2);
  str1=str2;
  System.out.println(str1);
  System.out.println(str2);
 }
}