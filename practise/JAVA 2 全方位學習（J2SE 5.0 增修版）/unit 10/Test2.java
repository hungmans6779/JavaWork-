public class Test2
{
 static int i=0;
 public static void main(String argv[])
 {
  Test2 t=new Test2();
  t.A();
  System.out.println(i); 
 }
  public void A()
  {
   int i=10;
   B(i);
   Test2.i=i;
  }
  public void B(int i)
  {
   i++;
  }
}