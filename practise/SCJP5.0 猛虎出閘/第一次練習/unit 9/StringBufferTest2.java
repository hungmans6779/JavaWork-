//StringBuffer �O�@��thread-safe�����O
public class StringBufferTest2
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("JAVA ");
  sb1.append("SCJP ");
  System.out.println("sb1= "+sb1);
  System.out.println("sb1��length= "+sb1.length());
  System.out.println("sb1��capacity= "+sb1.capacity());

 }
}