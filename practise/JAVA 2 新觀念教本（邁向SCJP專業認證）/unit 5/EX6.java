//��ܱƧǪk
class EX6
{
 public static void main(String argv[])
 {
 	int temp=0;
 	int count=1;
  if(argv.length<2)
  {
   System.out.println("�п�J�ƭӼƦr�]2�ӥH�W���Ʀr�^�H�i���ܱƧ�");
   System.exit(0);	
  }	
  int num[]=new int[argv.length];
  for(int i=0;i<argv.length;i++)
  {
   num[i]=Integer.parseInt(argv[i]);
  }	
  System.out.println("���d�ҬO��ܱƧǪk���ܽd");
  System.out.println("==========================================================================");
  for(int i=0;i<argv.length-1;i++)
  {	
   for(int j=i+1;j<argv.length;j++)
   {
   	System.out.print("�� "+count+" ���Ƨ�"+"\t");
   	count++;
   	for(int k=0;k<argv.length;k++)
   	{	
   	 if(k==i || k==j)
   	 { System.out.print(num[k]+"*\t"); }		
   	 else
   	 { System.out.print(num[k]+"\t"); }  		
   }
   	
   	
   	if(num[i]>num[j])
   	{
   	 temp=num[i];
   	 num[i]=num[j];
   	 num[j]=temp;	
   	 System.out.print("\t"+num[j]+" �M "+num[i]+" ���");
   	}	    	 	
   	System.out.println();
   }		
  	
  }	
  
  
  System.out.println("\n\n�Ƨǫ᪺���G��: ");
  for(int i=0;i<argv.length;i++)
  {
   System.out.print(num[i]+"\t");	
  }	
 }
}