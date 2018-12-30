//StringBuilder是一個non-thread-safe的類別
public class StringBuilderTest1
{
 public static void main(String argv[])
 {
  StringBuilder sb1=new StringBuilder("JAVA ");
  sb1.append("SCJP ").append("5.0");
  System.out.println("sb1= "+sb1);
  
  StringBuilder sb2=new StringBuilder("JAVA ");
  sb2=sb2.append("SCJP ").append("5.0");
  System.out.println("sb2= "+sb2);
  
  System.out.println(new StringBuilder("JAVA ").append("SCJP ").append("5.0"));
 }
}