public class MathRandomTest1
{
 public static void main(String argv[])
 {
 	int num[]=new int[20];
 	for(int i=0;i<20;i++)
 	{
   num[i]=(int)(Math.random()*4);
  } 
  for(int value:num)
  {
   System.out.print(value+"\t");
  } 
 }
}