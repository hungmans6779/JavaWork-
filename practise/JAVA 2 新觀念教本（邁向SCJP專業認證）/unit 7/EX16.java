class EX16
{
 public static void main(String argv[])
 {
  for(int i=1;i<20;i++)
  {
   System.out.print(f(i)+"\t");
  }
 }
 static int f(int n)
 {
  if(n==1 | n==2)
  {
   return 1;
  }
  else
  {
   return f(n-1)+f(n-2);
  }
 }
}