public class VarargeTest1
{
 public static void main(String argv[])
 {
  doTest(1);
  doTest(2,3);
 }
// static void doTest(int ... x){}
 static void doTest(int []x){}
}