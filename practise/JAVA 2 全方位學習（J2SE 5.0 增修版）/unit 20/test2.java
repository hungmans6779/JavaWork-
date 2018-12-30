public class test2
{
 public static void main(String argv[])
 {
   StringBuffer sb1=new StringBuffer("Hello ");
   StringBuffer sb2;
   sb2=sb1.append("Java");
   System.out.println(sb1);
   System.out.println(sb2);
   System.out.println(sb1.equals(sb2));
 }
}