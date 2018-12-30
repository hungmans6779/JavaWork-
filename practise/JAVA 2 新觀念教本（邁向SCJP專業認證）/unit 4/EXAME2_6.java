class EXAME2_6
{
 public static void main(String argv[])
 {
 	Long i=0L;
 	long n=Long.MAX_VALUE; 	
 	//int n=199999;
 	int prim=1;
 	double value=0.0,num=0.0;
 	while(i<n)
 	{
 	 if(i%2==1)
 	 { prim=-1; }		
 	 else
 	 { prim=1; }	
 	 value=1.0/((1+i*2)*prim);	
 	 num+=value;	
   i++;
  }
  System.out.println("£k = "+4*num);
 }
}