public class cTest20
{
 public static void main(String argv[])
 {
  int value[]={2,32,43,23,5764,34,132,54,237};
  int temp=0;
  for(int i=0;i<value.length-1;i++)
  {
   for(int j=i+1;j<value.length;j++)
   {
   	if(value[i]<value[j])
   	{
   	 temp=value[i];
   	 value[i]=value[j];
   	 value[j]=temp;
   	}	
   }		
  }
  for(int da:value)
   System.out.println(da);	
 }
}