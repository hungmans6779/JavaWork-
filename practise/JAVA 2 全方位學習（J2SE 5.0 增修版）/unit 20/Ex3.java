public class Ex3
{
 public static void main(String argv[])
 {
  String str1="Java";
  String str2=str1.toUpperCase();
  StringBuffer sb1=new StringBuffer(str1);
  StringBuffer sb2=sb1.reverse();
 
  boolean ans1=str1==str2;
  boolean ans2=sb1==sb2;
  System.out.println(ans2);
  
 }

}