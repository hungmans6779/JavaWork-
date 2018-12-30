public class EX11
{
 public static void main(String argv[])
 {
  Sub11 b=new Sub11(7);
  System.out.println(b.getN());
 }
}

class Super11
{
 private int n;
 Super11(int n)
 {
  this.n=n;
 } 
 int getN()
 {
  return n;
 }
}

class Sub11 extends Super11
{
 private int i=99;	 
 Sub11(int n)
 {
  super(n);
 }
}