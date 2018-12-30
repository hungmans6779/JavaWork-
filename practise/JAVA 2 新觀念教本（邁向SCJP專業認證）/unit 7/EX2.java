public class EX2
{
 public static void main(String argv[])
 {
  AccessTest1 at=new AccessTest1();
  System.out.println(at.pub);
  System.out.println(at.pro);
  System.out.println(at.def);
 // System.out.println(at.pri);
  System.out.println(at.att);
  System.out.println(at.arr);
  System.out.println(at.ex2);
  
 }
}

class AccessTest1
{
 public int pub=1;
 protected int pro=2;
 int def=3;
private int pri=4;
 
 boolean att;
 int arr[];
 EX2 ex2;
}