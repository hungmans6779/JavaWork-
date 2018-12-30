public class Boolean2
{
 public static void main(String argv[])
 {
  Boolean b1=new Boolean(true);
  Boolean b2=new Boolean("false");
  System.out.println(b2.compareTo(b1));
  System.out.println(b2.equals(b1));
 }
}