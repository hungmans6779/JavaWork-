//StringBuilder�O�@��non-thread-safe�����O
public class StringBuilderTest2
{
 public static void main(String argv[])
 {
  StringBuilder sb1=new StringBuilder("JAVA ");
  sb1.append("SCJP ").append("5.0");
  System.out.println("sb1= "+sb1);
  System.out.println("sb1��length= "+sb1.length());
  System.out.println("sb1��capacity= "+sb1.capacity());
 }
}