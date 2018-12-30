public class test3
{
 public static void main(String argv[])
 {
   StringBuffer sb1=new StringBuffer("Hello ");
   sb1.append("Java");
   StringBuffer sb2=sb1;
   System.out.println("sb1 :"+sb1);
   System.out.println("sb2 :"+sb2);
   System.out.println(sb1.equals(sb2));
 }
}