public class EX28
{
 public static void main(String argv[])
 {
  new Outer().new Inner();
 }
}

class Outer
{
 //static String s="�~��";
 String s="�~��";
 class Inner
 {
  String s="����";
  Inner()
  {
   System.out.println(this.s);
   System.out.println(Outer.this.s);
   //System.out.println(Outer.s);
  }
 }
}