class EXAME2_3
{
 public static void main(String argv[])
 {
  int value1,value2;
  for(int i=0;i<4;i++)
  {
   value1=i;
   value2=6-i;
   for(int j=0;j<7;j++)
   {
   	if(j>=value1 && j<=value2)
     System.out.print("*");
    else
     System.out.print(" "); 
   }
   System.out.println();
  }
  for(int i=1;i<=3;i++)
  {
   value1=3-i;
   value2=3+i;	
   for(int j=0;j<=7;j++)
   {
   	if(j>=value1 && j<=value2)
   	 System.out.print("*");	
   	else
   	 System.out.print(" "); 
   }	 	
   System.out.println();
  }	
 
 }
}