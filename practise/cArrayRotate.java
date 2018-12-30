public class cArrayRotate
{
 public static void main(String argv[])
 {
  int [][]value=new int[5][5];
  int [][]value1=new int[5][5];
  for(int i=0;i<value.length*value.length;i++)
  {
   value[i/5][i%5]=i+1;	
  }		
  
  
  for(int a=0;a<value.length;a++)
  {
   for(int b=0;b<value.length;b++)
   {
   	System.out.print(value[a][b]+"\t");
   	value1[b][4-a]=value[a][b];
   }		
   System.out.println();
  }
  
  
  System.out.println();
  
  
  for(int a=0;a<5;a++)
  {
   for(int b=0;b<5;b++)
   {
   	System.out.print(value1[a][b]+"\t");
   }		
   System.out.println();
  }	
   
  
  
  
  	
 }		
}	