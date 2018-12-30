//StringBuffer 是一個thread-safe的類別
public class StringBufferTest3
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("0123456789");
  String str=sb1.substring(0,4);
  System.out.println("str= "+str);
  
  System.out.println("取代前sb1= "+sb1);
  sb1.replace(0,3,"JAVA");
  System.out.println("取代後sb1= "+sb1);
 }
}