class EX9
{
 public static void main(String argv[])
 {
 	int num[]={11,16,21,25,28,32,35,36,42,49,56,68,69,76,81,97};
  int left=0,right=num.length,count=0;
  System.out.println("rigth"+right);
  int mid=0;
 
  if(argv.length<1)
  {
   System.out.println("�п�J�@�ӼƦr");
   for(int i=0;i<num.length;i++)
   {
   	System.out.print(num[i]+"\t");
   }		
   System.exit(0);
  }
  
  System.out.println("�����G���j�M�k���d��");
  System.out.println("===================================================================");
   for(int i=0;i<num.length;i++)
   { System.out.print(num[i]+" "); }		 
   System.out.println();
   int search=Integer.parseInt(argv[0]);
  while(true)
  {
   count++;	
   mid=(left+right)/2;
   for(int k=0;k<mid;k++)
   {
   	System.out.print("   ");
   }	
   
   if(search==num[mid])
   {
   	System.out.println("���w�g���F");
   	System.out.println("�@���F "+count+" ��\n");
   	break;
   }		
   else
   {
   	if(mid==left)
  	{
  	 System.out.println("��p�I�䤣��........");
  	 break;	
  	}	
  	if(num[mid]<search)
  	{ left=mid;	}	
  	else
  	{ right=mid; }	
  	System.out.print("X\n");
   }
  	
  	
  }	

 }
}