class EX12
{
 public static void main(String argv[])
 {
  int i=41;
  int j=~i;
  System.out.println(i);
  printBits(i);
  System.out.println(j);
  printBits(j);
 }
 static void printBits(int n)
 {
 	int bit=32;
 	int m;
 	for(int i=0;i<bit;i++)
 	{
 	 m=n>>>(bit-1-i);
 	 System.out.print(m&1);
 	} 
 	System.out.println();
 }	
}