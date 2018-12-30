public class AutoBoxingTest1_3
{
 public static void main(String argv[])
 {
  Integer i1=-128;
  Integer i2=-128;
  if(i1!=i2)
  { System.out.println("i1!=i2"); }
  if(i1.equals(i2))
  { System.out.println("i1.equals(i2) : "+(i1.equals(i2)));}
  Integer i3=127;
  Integer i4=127;
  if(i3==i4)
  { System.out.println("i3==i4"); }
  if(i3.equals(i4))
  { System.out.println("i3.equals(i4) : "+(i3.equals(i4)));}
 }
}