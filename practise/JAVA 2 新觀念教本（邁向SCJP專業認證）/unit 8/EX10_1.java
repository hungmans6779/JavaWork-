 public class EX10_1
{
 public static void main(String argv[])
 {
  Sub b=new Sub(7);
  System.out.println(b.n);
 }
}

class Super
{
 int n;
 Super(int n)
 {
  this.n=n;
 }
 Super()
 {
  System.out.println("�I�sSuper���L�Ѽƫغc�l");
 }
}
class Sub extends Super
{
 Sub(int n)
 {
 	this.n=n;
 }		
}