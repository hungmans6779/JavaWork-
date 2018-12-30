class EX16
{
 public static void main(String argv[])
 {
  int value=-123;
  System.out.println("value = "+value);
  IntToBit.printBits(value);
  System.out.println("value >>>3 = "+(value>>>3));
  IntToBit.printBits(value>>>3);
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