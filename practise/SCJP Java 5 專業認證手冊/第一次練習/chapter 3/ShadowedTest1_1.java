public class ShadowedTest1_1
{
 int size=7;
 public static void main(String argv[])
 {
 	ShadowedTest1_1 s=new ShadowedTest1_1();
  System.out.println("change before = "+s.size);
  s.changIt(s.size);
  System.out.println("change after = "+s.size);
 }
 void changIt(int size)
 {
  size=size+200;
  System.out.println("size = "+size);
 }
}