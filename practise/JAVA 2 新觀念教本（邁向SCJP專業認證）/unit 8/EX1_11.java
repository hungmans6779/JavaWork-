class Super
{
 Super(int i)
 {
  System.out.print(i);
 }
}
class Sub extends Super
{
 {
  System.out.println(5);
 }
 Sub()
 {
  super(4);
 }
}

public class EX1_11
{
 public static void main(String argv[])
 {
  new Sub();
 } 
}