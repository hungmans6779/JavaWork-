public class EX9
{
 public static void main(String argv[])
 {
  Sub a=new Sub();
  System.out.println(a.n);
  //Sub b=new Sub(100);  建構子不會被繼承
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
 	
 }	
 
}

class Sub extends Super
{
 
}