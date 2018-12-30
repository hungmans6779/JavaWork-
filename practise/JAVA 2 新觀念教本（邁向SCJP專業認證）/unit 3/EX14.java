public class EX14
{
 public static void main(String argv[])
 {
  int value=44;
  System.out.println("value = "+value);
  IntToBit.printBits(value);
  int j=value<<2;
  System.out.println("value << 2 = "+j);
  IntToBit.printBits(j);
  System.out.println("value *4 = "+value*4);
 }
}

class IntToBit
{
 static void printBits(int n)
 {
  int bit=32;
  for(int i=0;i<bit;i++)
  {
   int m=n>>>bit-1-i;
   System.out.print(m&1);
  }
  System.out.println();
 }

}