public class cTest71
{
 public static void main(String argv[])
 {
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("  ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("*   ");
   System.out.println();
  } 
 }		
}	