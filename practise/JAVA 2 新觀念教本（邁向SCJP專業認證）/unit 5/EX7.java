//氣泡排序法
class EX7
{
 public static void main(String argv[])
 {
 	int temp=0;
 	int count=1;
  if(argv.length<2)
  {
   System.out.println("請輸入數個數字（2個以上的數字）以進行選擇排序");
   System.exit(0);	
  }	
  int num[]=new int[argv.length];
  for(int i=0;i<argv.length;i++)
  {
   num[i]=Integer.parseInt(argv[i]);
  }	
  System.out.println("此範例是氣泡排序法的示範");
  System.out.println("==========================================================================");
  for(int i=0;i<argv.length-1;i++)
  {	
   for(int j=0;j<argv.length-1-i;j++)
   {
   	System.out.print("第 "+count+" 次排序"+"\t");
   	count++;
   	for(int k=0;k<argv.length;k++)
   	{	
   	 if(k==j || k==j+1)
   	 { System.out.print(num[k]+"*\t"); }		
   	 else
   	 { System.out.print(num[k]+"\t"); }  		
   }
   	
   	
   	if(num[j]>num[j+1])
   	{
   	 temp=num[j];
   	 num[j]=num[j+1];
   	 num[j+1]=temp;	
   	 System.out.print("\t"+num[j+1]+" 和 "+num[j]+" 對調");
   	}	    	 	
   	System.out.println();
   }		
  	
  }	
  
  
  System.out.println("\n\n排序後的結果為: ");
  for(int i=0;i<argv.length;i++)
  {
   System.out.print(num[i]+"\t");	
  }	
 }
}