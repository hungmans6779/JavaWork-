public class IntegerTest2
{
 public static void main(String argv[])
 {
  int i=10;
  Integer j=new Integer(i);
  int k=j.intValue();
  System.out.println(k);
  //System.out.println(j.getClass());
 }
}