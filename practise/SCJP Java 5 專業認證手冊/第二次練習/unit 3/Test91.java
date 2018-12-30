public class Test91
{
 public static void main(String argv[])
 {
  Integer i1=100;
  Integer i2=100;
  if(i1==i2) System.out.println("same object");
  if(i1.equals(i2)) System.out.println("meaningfully equal");
 }
}