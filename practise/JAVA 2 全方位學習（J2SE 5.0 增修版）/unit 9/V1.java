public class V1
{
 public static void main(String argv[])
 {
  Av1 a=new Av1();
  Bv1 b=new Bv1();
  Cv1 c=new Cv1();

 try
  {
   b=(Bv1) a;
  }
 catch (ClassCastException e)
 {
  //System.err.println(e);
  //System.out.println(e.getLocalizedMessage());
  //System.out.println(e.getMessage());
  e.printStackTrace();
 } 

 }
}

class Av1 {}
class Bv1 extends Av1 {}
class Cv1 extends Av1 {}