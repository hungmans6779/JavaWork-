class Super
{
 Super(boolean b)
 {
  if(b)
   System.out.println(b);
 }
}
class Sub extends Super
{
 Sub()
 {
  super(false);
 }
}
public class EX1_10
{
 public static void main(String argv[])
 {
  new Sub();
 }
}