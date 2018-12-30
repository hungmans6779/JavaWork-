public class EXAME5_10
{
 public static void main(String argv[])
 {
  int x=9;
  int y=6;
  for(int z=0;z<6;z++,y--)
  {
   if(x>2) x--;
   label:
    if(x>5)
    {
      System.out.print(x+" ");
      --x;
      //continue label;	
    }		
    x--;
  }	
 }
}