public class EX28
{
 public static void main(String argv[])
 {
  new Outer().new Inner();
 }
}

class Outer
{
 //static String s="外部";
 String s="外部";
 class Inner
 {
  String s="內部";
  Inner()
  {
   System.out.println(this.s);
   System.out.println(Outer.this.s);
   //System.out.println(Outer.s);
  }
 }
}