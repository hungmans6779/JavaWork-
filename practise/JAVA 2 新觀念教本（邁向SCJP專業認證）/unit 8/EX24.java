public class EX24
{
 public static void main(String argv[])
 {
  new EX24();
  System.out.println("======================");
  new EX24().new Sub();
  System.out.println("======================");
  new EX24().new Sub().new Sub();
  System.out.println("======================");
  new EX24().new Sub().new Sub().new Sub();
  System.out.println("======================");
  new EX24().new Sub().new Sub().new Sub().new Sub();
 }
 EX24()
 {
  System.out.println("«Øºc¤l : "+this);
 }
 class Sub extends EX24{}
}