public class EX15
{
 public static void main(String rang[])
 {
  int value=123;
  System.out.println("value = "+value);
  IntToBit.printBits(value);
  System.out.println("value >>3 ="+(value>>3));
  IntToBit.printBits(value>>3);
  System.out.println("value/8 = "+value/8);
  IntToBit.printBits(value/8);
  int j=~value;
  System.out.println("~value = "+j);
  IntToBit.printBits(j);
  System.out.println("~value>>3 = "+(j>>3));
  IntToBit.printBits(j>>3);
 }
}

class IntToBit
{
 static void printBits(int n)
 {
  int bit=32;
  for(int i=0;i<bit;i++)
  {
   System.out.print(n>>>bit-1-i&1);
  }
  System.out.println();
 }
}