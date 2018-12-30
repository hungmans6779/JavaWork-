class EX13
{
 public static void main(String argv[])
 {
  int value=Integer.MAX_VALUE;
  System.out.print(value+" 二進制轉換為 : ");
  printBits(value);
  value+=2;
  System.out.print(value+" 二進制轉換為 : ");
  printBits(value);
  value=~value;
  System.out.print(value+" 二進制轉換為 : ");
  printBits(value);
 }
 static void printBits(int n)
 {
 	int bit=32;
 	for(int i=0;i<bit;i++)
 	{
 	 int m=n>>>(bit-1-i);
 	 System.out.print(m&1);	
 	}	
 	System.out.println();
 }	
}