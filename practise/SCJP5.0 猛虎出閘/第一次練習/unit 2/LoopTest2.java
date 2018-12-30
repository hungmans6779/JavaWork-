class LoopTest2
{
 public static void main(String argv[])
 {
 	Out:
  for(int i=1;i<10;i++)
  {
   Inner:
   for(int j=1;j<10;j++)
   {	
    if(j==8)
    {break Inner;}
    if(j%3==0)
    {continue Inner;}
    if(i==8)
    {break Out; }
    if(i%3==0)
    {continue Out;}
    System.out.print("i= "+i+" j= "+j+"\t");  
   } 
   System.out.println();
  }
 }
}