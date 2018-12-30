class EXAME2_2
{
 public static void main(String argv[])
 {
  char c[]={'A','B','C','D','E'};
  int value1,value2;
  for(int i=0;i<5;i++)
  {
   value1=5-i;
   value2=5+i;	
   for(int j=0;j<10;j++)
   {	
   	if(j<=value2 && j>=value1)
   	{
   	 System.out.print(c[i]);
   	}
   	else
   	{
   	 System.out.print(" ");	
   	}	 
   }	 
   System.out.println();
  }	
 }
}
