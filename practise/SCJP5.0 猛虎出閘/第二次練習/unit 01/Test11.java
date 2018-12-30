public class Test11
{
 public static void main(String argv[])
 {
  int i=1;
  double d;
  d=i;
  //i=d;
  i=(int)d;
  float f;
  //f=2.5;
  f=2.5f;
  f=(float)2.5;
  System.out.println("d="+d);
  System.out.println("i="+i);
  System.out.println("f="+f);
 }
}