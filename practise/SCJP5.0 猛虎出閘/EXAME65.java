import java.util.*;
public class EXAME65
{
 String s;
 public EXAME65(String s)
 {
  this.s=s;
 }
 public static void main(String argv[])
 {
  EXAME65 ex1=new EXAME65("ex1");
  EXAME65 ex2=new EXAME65("ex1");
  String str1=new String("str1");
  String str2=new String("str1");
  HashSet<Object> hash=new HashSet<Object>();
  hash.add(ex1);
  hash.add(ex2);
  hash.add(str1);
  hash.add(str2);
  System.out.println("size = "+hash.size());
 }
}