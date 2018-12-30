public class Test9
{
 public static void main(String argv[])
 {
  Integer i1=1000;
  Integer i2=1000;
  if(i1!=i2) System.out.println("differenet object");
  if(i1.equals(i2)) System.out.println("meaningfully equal");
 }
}