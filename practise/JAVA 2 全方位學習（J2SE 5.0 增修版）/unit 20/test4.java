public class test4
{
 public static void main(String argv[])
 {
   StringBuffer sb1=new StringBuffer("HelloJava");
   char dst[]=new char[5];
   sb1.getChars(1,5,dst,0);
   for(int i=0;i<dst.length;i++)
   {
    System.out.println(dst[i]);	
   }
 }
}