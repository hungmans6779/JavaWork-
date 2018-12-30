class EX17
{
 public static void main(String argv[])
 {
  int c[]={2,4,6,8,10};
  int j=0;
  for(int i:c)
  {
   i=++j;	
  }	
  for(int i:c)
  {
   System.out.println(i);	
  }	
 }
}