//¦¹½d¨Ò¬O¿ù»~ªº...........
public class StringBufferTest5
{
 public static void main(String argv[])
 {
  StringBuffer sb1=new StringBuffer("0123456789");
  String str=sb1.substring(0,4);
  System.out.println("str= "+str);
   
   sb1.sub(0,5).replace(0,2,"JA");
 }
}