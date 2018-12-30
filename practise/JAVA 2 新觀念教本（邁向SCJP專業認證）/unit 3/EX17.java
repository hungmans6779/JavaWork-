public class EX17
{
 public static void main(String argv[])
 {
  byte a=100;
  int b;
  b=~a;
  IntToBit.printBits(b);
  System.out.println(254525423542L*1.0F);
  System.out.println(254525423542L*1.0);
 }
}

class IntToBit
{
 static void printBits(int n)
 {
  int bit=32;
  for(int i=0;i<bit;i++)
  {
   int m=n>>bit-1-i;
   System.out.print(m&1);
  }
  System.out.println();
 }
}