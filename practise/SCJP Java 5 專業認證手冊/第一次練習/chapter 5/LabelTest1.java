public class LabelTest1
{
 public static void main(String argv[])
 {
 
  for(int x=0;x<10;x++)
  {
   for(int y=0;y<10;y++)
   {
   	System.out.println(x+" "+y);
    outer:
    if(y==1)
    {
     	
     break outer;
    }
   }
  }
 }
}