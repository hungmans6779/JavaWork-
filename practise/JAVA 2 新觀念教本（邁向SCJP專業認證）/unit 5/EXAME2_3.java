class EXAME2_3
{
 public static void main(String argv[])
 {
  int num[]={23,54,6,87,30,47,13,17,91,72};
  int temp=0;
  for(int i=0;i<num.length-1;i++)
  {
   for(int j=i+1;j<num.length;j++)
   {
   	if(num[i]<num[j])
   	{
   	 temp=num[i];
   	 num[i]=num[j];
   	 num[j]=temp;	
   	}	
   }		
  }
  for(int i:num)
   System.out.print(i+"\t");
  	
 }
}