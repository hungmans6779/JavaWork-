class EX7
{
 public static void main(String argv[])
 {
  int arr[]={9,4,5,1,6,8};
  System.out.println("arrªº°Ñ·Ó : "+arr);
  showArr(arr);
  sortArr(arr);
  showArr(arr);
 }
 static void showArr(int [] num)
 {
  for(int data:num)
  {
   System.out.print(data+"\t");	
  }		
  System.out.println();
 }
 static void sortArr(int [] num)
 {
 	int temp=0;
 	for(int i=0;i<num.length-1;i++)
 	{
 	 for(int j=i;j<num.length;j++)	
 	 {
 	 	if(num[i]>num[j])
 	 	{
 	 	 temp=num[i];
 	 	 num[i]=num[j];
 	 	 num[j]=temp;	
 	 	}	
 	 }	
 	}	
 }	
}