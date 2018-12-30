class EXAME2_7
{
 public static void main(String argv[])
 {
  int bit=32;
  for(int i=0;i<32;i++)
  {
   int m=-2>>bit-1-i;
   System.out.print(m&1);
  }
 }
}