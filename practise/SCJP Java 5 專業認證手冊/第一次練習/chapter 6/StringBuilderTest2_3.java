public class StringBuilderTest2_3
{
 public static void main(String argv[])
 {
  StringBuilder sb1=new StringBuilder("set ");
  sb1.append("variable x");
  System.out.println("sb1 = "+sb1);
  StringBuilder sb2=new StringBuilder("SCJP ");
  sb2.append(1.5f);
  System.out.println("sb2 = "+sb2);
  StringBuilder sb3=new StringBuilder("0123456789");
  sb3.delete(5,7);
  System.out.println("sb3 = "+sb3);
  //StringBuilder sb4="test";
  System.out.println(sb1.capacity());
  System.out.println(sb2.capacity());
  System.out.println(sb3.capacity());
  System.out.println(sb1.length());
  System.out.println(sb2.length());
  System.out.println(sb3.length());
  sb3.replace(1,4,"Apple ");
  System.out.println("sb3="+sb3);
  sb2.insert(0,"JAVA 的基礎認證是 : ");
  System.out.println("sb2 = "+sb2);
   
 }
}