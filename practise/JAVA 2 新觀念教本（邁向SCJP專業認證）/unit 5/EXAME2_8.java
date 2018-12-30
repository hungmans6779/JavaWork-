class EXAME2_8
{
 public static void main(String argv[])
 {
  int count1=17;
  int count=count1; 
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<5;j++)
   {
     System.out.print(count*count+"\t");
     count=count-4;
   }
   count1++;
   count=count1;
   System.out.println();
  }
 
 }
}