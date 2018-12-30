public class cTest30
{
 public static void main(String argv[])
 {
  //在Intger值如果介於-128～127值會相等(==)會一樣
  Integer i1=-128;
  Integer i2=-128;
  Integer i3=-129;
  Integer i4=-129;
  Integer i5=-127;
  Integer i6=-127;
  Integer i7=128;
  Integer i8=128;
  System.out.println("i1==i2==>"+(i1==i2));
  System.out.println("i3==i4==>"+(i3==i4));
  System.out.println("i5==i6==>"+(i5==i6));
  System.out.println("i7==i8==>"+(i7==i8));
  Integer ii1=new Integer(127);
  Integer ii2=new Integer(127);
  System.out.println("ii1==ii2==>"+(ii1==ii2));
 }
}