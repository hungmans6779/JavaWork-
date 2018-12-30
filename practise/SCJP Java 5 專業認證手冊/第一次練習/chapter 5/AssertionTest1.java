class As {}	
public class AssertionTest1
{
 public static void main(String argv[])
 {
  int x=3,y=6;
  assert (x<y) :"²Â³J";
  //assert (x);
  //assert 0;
  //assert (x=1);
  assert (x<y):new As();
  //assert (x<y):AS as;
  assert (x<y):reT1();
  //assert (x<y):reT();
  assert (x==3):x;
  //assert (x==3):;
 }
 static void reT()
 {}
 static int reT1()
 {
 	return 1;
 }	
}