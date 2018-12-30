//StringBuffer 是一個thread-safe的類別
public class StringBufferTest4
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("0123456789");
  String str=sb1.substring(0,4);
  System.out.println("str= "+str);
  
  System.out.println("刪除前sb1= "+sb1);
  sb1.delete(0,3);
  System.out.println("刪除後sb1= "+sb1);
 }
}