class EXAME2_5
{
 public static void main(String argv[])
 {
 	int count=0,temp=0;
 	int num[]=new int[250];
 	while(count<250)
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
  for(int i=0;i<num.length;i++)
  {
   System.out.println("�� "+(i+1)+" ���� : "+num[i]);		
  }	 
  
  System.out.println("\n=============================================");
  int left=0,mid=0;
  int right=num.length;
  int count1=0;
  int search=Integer.parseInt(argv[0]);
  while(true)
  {
   mid=(left+right)/2;
   count1++;
   if(search==num[mid])
   {
   	System.out.println(search+" �o����Ƥw���F�A�b "+(mid+1)+" ��������");
   	System.out.println("�@���F "+count1+" ��");
    break;	
   }		
   else
   {
   	if(mid==left)
   	{
   	 System.out.println(search+" �o����Ƥ��b���}�C��.....");
     break;	 	
   	}	
   	if(num[mid]<search)
   	{
   	 left=mid;	
   	}	
   	else
   	{
   	 right=mid;	
   	}	
   	
   }	
  	
  }	
 }
}