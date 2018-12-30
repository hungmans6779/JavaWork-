class EX19
{
 public static void main(String argv[])
 {
 	System.out.println(sum());
 	System.out.println(sum(1,2,3,4,5,6));
 	System.out.println(sum(32,45,78));
 }		
 static int sum(int ... n)
 {
 	int s=0;
 	for(int value:n)
 	{
 	 s+=value;	
 	}	
 	return s;
 }	
}