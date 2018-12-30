class EX8
{
 public static void main(String argv[])
 {
  int a=100,b=100;
  boolean c=false,d=false;
  System.out.println(6<5&&39>17&&a==7);
  System.out.println(3<9 || 7<12 || b<=a);
  c=3>4 && (d=true);
  System.out.println("Try1: c="+c+" , d="+d);
  c=3>2 && (d=true);
  System.out.println("Try2: c="+c+" , d="+d);
 }
}