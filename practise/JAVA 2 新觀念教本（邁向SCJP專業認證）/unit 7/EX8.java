class EX8
{
 public static void main(String argv[])
 {
  int num,factor;
  if(argv.length<1)
  {
   System.out.println("�п�J�@�Ӥj��s����ơI�I�I");
   return;
  }
  num=Integer.parseInt(argv[0]);
  if(num<2)
  {
   System.out.println("��ƭȥ����j��1 �I�I�I");
   return;
  }
  factor=maxFactor(num);
  if(factor==0)
  {
   System.out.println(num+" ���@�ӽ��");	
  }	
  else
  {
   System.out.println(num+" ���̤j���]�Ƭ� "+factor);	
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