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
   System.out.println("第 "+(i+1)+" 元素 : "+num[i]);		
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
   	System.out.println(search+" 這筆資料已找到了，在 "+(mid+1)+" 的元素中");
   	System.out.println("共比對了 "+count1+" 次");
    break;	
   }		
   else
   {
   	if(mid==left)
   	{
   	 System.out.println(search+" 這筆資料不在此陣列中.....");
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