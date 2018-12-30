class EXAME2_4
{
 public static void main(String argv[])
 {
 	int count=0,temp=0;
 	int num[]=new int[100];
 	while(count<100)
 	{
 	 temp=(int)(Math.random()*1000);
 	 if(temp>0 && temp<500)
 	 {
 	 	num[count]=temp;
 	  count++;	
 	 }	
  }
	
  for(int i=0;i<num.length-1;i++)
  {
   for(int j=0;j<(num.length-i-1);j++)	
   {
   	if(num[j]>num[j+1])
   	{
   	 temp=num[j];
   	 num[j]=num[j+1];
   	 num[j+1]=temp;	
   	}	
   }
  }
  System.out.println("=================================");
  for(int i=0;i<100;i++)
  {
   System.out.println((i+1)+" ¤¸¯À : "+num[i]);		
  }	 
 }
}