class EX11_2
{
 public static void main(String argv[])
 {
  int  n=59;
  System.out.print(n+" �ഫ���G�i� : ");
  int bit=32;
  int m;
  for(int i=0;i<bit;i++)
  {
   m=n>>>(bit-1-i);
   System.out.print(m&1);
  }
 }
}