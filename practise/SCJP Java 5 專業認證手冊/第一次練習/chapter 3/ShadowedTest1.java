public class ShadowedTest1
{
 static int size=7;
 public static void main(String argv[])
 {
  System.out.println("change before = "+size);
  ShadowedTest1 s=new ShadowedTest1();
  s.changIt(size);
  System.out.println("change after = "+size);
 }
 void changIt(int size)
 {
  size=size+200;
  System.out.println("size = "+size);
 }
}