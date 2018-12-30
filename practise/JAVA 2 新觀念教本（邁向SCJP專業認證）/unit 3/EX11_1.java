class EX11_1
{
 public static void main(String argv[])
 {
  //long n=Long.MAX_VALUE;
  long n=59;
  System.out.print(n+" 轉換成二進位制為 : ");
  int add=0;
  int c[]=new int[64];
  while(true)
  {
   c[add]=(n%2)>0?1:0;
   add++;
   if(n/2<=0)
   {
   	for(int i=add;i>0;i--)
   	{ System.out.print(c[i-1]);	}	
   	break; 
   }	
    n/=2;
  }
 }
}