class EX8
{
 public static void main(String argv[])
 {
  int num,factor;
  if(argv.length<1)
  {
   System.out.println("請輸入一個大於零的整數！！！");
   return;
  }
  num=Integer.parseInt(argv[0]);
  if(num<2)
  {
   System.out.println("整數值必須大於1 ！！！");
   return;
  }
  factor=maxFactor(num);
  if(factor==0)
  {
   System.out.println(num+" 為一個質數");	
  }	
  else
  {
   System.out.println(num+" 的最大公因數為 "+factor);	
  }	
  
 }
 
 static int maxFactor(int num)
 {
 	for(int i=num-1;i>1;i--)
 	{
 	 if(num%i==0)
 	  return i;	
 	}	
 	return 0;
 }	
 
}