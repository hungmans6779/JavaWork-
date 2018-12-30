class EX3
{
 int i=0;
 static int s=100;
 public static void main(String argv[])
 {
  EX3 obj1=new EX3();
  EX3 obj2=new EX3();
  System.out.println(obj1.i++);
  System.out.println(++obj1.s);
  System.out.println(obj2.i+=10);
  System.out.println(obj2.s+=10);
  System.out.println("obj1.s=\t"+obj1.s);
  System.out.println("obj2.s=\t"+obj2.s);
  System.out.println("EX3.s=\t"+EX3.s);
  System.out.println("s=\t"+s);
 }
}