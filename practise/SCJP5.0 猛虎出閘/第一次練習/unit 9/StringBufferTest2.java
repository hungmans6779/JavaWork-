//StringBuffer 是一個thread-safe的類別
public class StringBufferTest2
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("JAVA ");
  sb1.append("SCJP ");
  System.out.println("sb1= "+sb1);
  System.out.println("sb1的length= "+sb1.length());
  System.out.println("sb1的capacity= "+sb1.capacity());

 }
}