public class EXAME123
{
 public void loop(int ... xx)
 {
 	for(int x:xx)
 	{
 	 System.out.print(x+"\t");	
 	}	
 	System.out.println();
 	for(int i=0;i<xx.length;i++)
 	{
 	 System.out.print(xx[i]+"\t");	
 	}	
 }		
 public static void main(String argv[])
 {
  int num[]=new int[]{1,2,3,4,5,6,7};
  new EXAME123().loop(num);
 }
}