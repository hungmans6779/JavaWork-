public class Scope
{
 static int i=3;
 int j=5;
 public static void main(String argv[])
 {
  i=10;
 // j=20;
  System.out.println("Scope i = "+i);
  Scope s=new Scope();
  s.A(2);
  s.B(30);
 }
  public void A(int i)
 {
  int j,k;
  i++;
  j=10;
  k=i+j;
  Scope.i=i+1;
  this.j=j+1;
  System.out.println("Scope i = "+Scope.i);
  System.out.println("this j = "+this.j);
  for (int x=0;x<10;x++)
  {
   k+=x;
  }
 }
 public void B(int i)
 {
  i++;
  this.i=i;
  System.out.println("this i = "+this.i);
 }
}
 
 


