//��w�ƧǪk
class EX7
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
  System.out.println("���d�ҬO��w�ƧǪk���ܽd");
  System.out.println("==========================================================================");
  for(int i=0;i<argv.length-1;i++)
  {	
   for(int j=0;j<argv.length-1-i;j++)
   {
   	System.out.print("�� "+count+" ���Ƨ�"+"\t");
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
   	 System.out.print("\t"+num[j+1]+" �M "+num[j]+" ���");
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