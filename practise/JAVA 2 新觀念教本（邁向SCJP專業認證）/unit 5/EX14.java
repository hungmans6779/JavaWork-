class EX14
{
 public static void main(String argv[])
 {
  int a[][]={{1,91},{2,79},{3,88},{4,95},{5,87},{6,74},{7,96},{8,72}};
  int temp[];
  for(int i=0;i<a.length-1;i++)
  {
   for(int j=i+1;j<a.length;j++)
   {
   	if(a[i][1]>a[j][1])
   	{
   	 temp=a[i];
   	 a[i]=a[j];
   	 a[j]=temp;	
   	}	
   }		
  }
  for(int i=0;i<a.length;i++)
  {
   System.out.println(a[i][0]+" ¸¹ "+a[i][1]+" ¤À");	
  }		
 
 }
}