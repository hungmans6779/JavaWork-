public class cTest4
{
 public static void main(String argv[])
 {
 	//方式1
  System.out.println(Byte.TYPE);
  //方式2
  Class c=Byte.TYPE;
  System.out.println(c.getClass());
 }
}