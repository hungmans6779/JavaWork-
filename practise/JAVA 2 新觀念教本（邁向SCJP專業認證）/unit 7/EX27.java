public class EX27
{
 public static void main(String argv[])
 {
  EX27 ex=new EX27();
  MyNonStatic ns1=ex.new MyNonStatic();
  EX27.MyNonStatic ns2=ex.new MyNonStatic();
  EX27.MyNonStatic ns3=new EX27().new MyNonStatic();
  
  Outer out=new Outer();
  Outer.YourNonStatic ns4=out.new YourNonStatic();
  Outer.YourNonStatic ns5=new Outer().new YourNonStatic();
  System.out.println(ns1);
  System.out.println(ns2);
  System.out.println(ns3);
  System.out.println(ns4);
  System.out.println(ns5);
 }
 
 class MyNonStatic
 {
 
 }
}

class Outer
{
 class YourNonStatic
 {
 
 }
}