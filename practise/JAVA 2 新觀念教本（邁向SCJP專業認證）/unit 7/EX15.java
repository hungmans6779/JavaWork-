class EX15
{
 public static void main(String argv[])
 {
  int n=Integer.parseInt(argv[0]);
  if(n<1)
  {
   System.out.println("請輸入一個大於1的整數值");
   return;
  }
  System.out.println(n+"! = "+fact(n));   
 }
 static long fact(int n)
 {
  if(n==1)
  {
   return 1;
  }
  else
  {
   return n*fact(n-1);
  }
 }
}