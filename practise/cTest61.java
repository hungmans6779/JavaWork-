public class cTest61
{
 public static void main(String argv[])
 {
 	for(int i=1;i<=15;i++)
 	 System.out.print(f(i)+"\t");
 }		
 public static int f(int n)
 {
 	if(n==1 || n==2)
 	 return 1;
 	else
 	 return f(n-1)+f(n-2);
 }	
}	