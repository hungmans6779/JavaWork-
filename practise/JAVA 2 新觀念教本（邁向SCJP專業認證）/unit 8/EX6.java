public class EX6
{
 public static void main(String argv[])
 {
  Sub b=new Sub();
  System.out.println("b.k = "+b.k);
  System.out.println("b.getK() = "+b.getK());
 }
}

class Super
{
 int k=3;
}

class Sub extends Super
{
 int getK()
 {
  return k;
 }
}