//StringBuffer 是一個thread-safe的類別
public class StringBufferTest1
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("JAVA ");
  sb1.append("SCJP ");
  System.out.println("sb1= "+sb1);
  
  StringBuffer sb2=new StringBuffer("JAVA ");
  sb2.append("SCJP ").append("5.0");
  System.out.println("sb2= "+sb2);
  
  StringBuffer sb3=new StringBuffer("JAVA ");
  sb3=sb3.append("SCJP ");
  System.out.println("sb3= "+sb3);
  
  StringBuffer sb4=new StringBuffer("JAVA ");
  sb4=sb4.append("SCJP ").append("5.0");;
  System.out.println("sb4= "+sb4);
  
  System.out.println(new StringBuffer("JAVA ").append("SCJP"));
 }
}