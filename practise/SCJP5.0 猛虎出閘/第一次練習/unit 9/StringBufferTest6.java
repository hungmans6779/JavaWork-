
public class StringBufferTest6
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("0123456789");
  String str=sb1.substring(0,4);
  System.out.println("str= "+str);
  sb1.delete(0,4).replace(0,1000,"Java");
  System.out.println("sb1= "+sb1); 
 }
}