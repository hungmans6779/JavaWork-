class Father 
{
 int legs=5;
}
public class ShadowTest1 extends Father
{
 int legs=4;
 public static void main(String argv[])
 {
  System.out.println("legs="+new ShadowTest1().legs);
 }
}