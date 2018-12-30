class LoopTest1
{
 public static void main(String argv[])
 {
  for(int i=1;i<10;i++)
  {
   if(i==8)
   {break;}
   if(i%3==0)
   {continue;}
   System.out.print(i+"\t");  
  }
 }
}