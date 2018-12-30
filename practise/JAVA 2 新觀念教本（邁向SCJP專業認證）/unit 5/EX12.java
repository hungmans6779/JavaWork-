class EX12
{
 public static void main(String argv[])
 {
  int num[][]=new int[3][4];
  for(int i=0;i<num.length;i++)
  {
   for(int j=0;j<num[i].length;j++)
   {
    num[i][j]=10*i+j;
   }
  }
  
  for(int i=0;i<num.length;i++)
  {
   for(int j=0;j<num[i].length;j++)
   {
    System.out.print("num["+i+"]["+j+"]="+num[i][j]+"\t");	
   }		
   System.out.println();
  }	
  
  System.out.println("num[0]="+num[0]);
  System.out.println("num[1]="+num[1]);
  System.out.println("num[2]="+num[2]);
  
 }
}