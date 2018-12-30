public class Monthday
{
 public static void main(String argv[])
 {
  System.out.println("              2007 年 5月              ");
  System.out.println("\n日\t一\t二\t三\t四\t五\t六");
  System.out.print("\t\t");
  int countCol=0;
  for(int i=1;i<=31;i++)
  {	
   if(i<=5)
   {
    System.out.print(i+"\t");
    if(i==5)
    {
     System.out.println();	
    }	
   }		
   else
   {
   	if(countCol==7)
   	{ 
   	 System.out.println(); 
   	 countCol=0;
   	}
   	countCol++;
   	System.out.print(i+"\t");
   }	
  }	
 }
}