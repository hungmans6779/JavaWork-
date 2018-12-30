class EXAME2_1
{
 public static void main(String argv[])
 {
  int a[]={36,41,24,17};
  int b[]={9,34,26,49};
  int temp;
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<b.length;j++)
   {
    if(a[i]<b[j])
    {
     temp=a[i];
     a[i]=b[j];
     b[j]=temp;
    }
   } 
  }
  
  for(int i:a)
  {
   System.out.print(i+"\t");	
  }	
  System.out.println();
  for(int i:b)
  {
   System.out.print(i+"\t");	
  }	
  
  
 }
}