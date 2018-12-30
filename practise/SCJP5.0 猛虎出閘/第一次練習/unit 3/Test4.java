class Test4
{
 public static void main(String argv[])
 {
   int num[]=new int[]{1,2,3,4,5,6,7,8,9,10};
   System.out.println("c[]ªº©M¬° : "+calue(num));
   System.out.println(calue1(1,2,3,4,5,6,7,8,9,10));
   System.out.println(calue1(num));
   System.out.println(calue1());
 }
  static int calue(int []n)
  {
  	int sum=0;
  	for(int i=0;i<n.length;i++)
 	  {
 	   sum+=n[i];	
   	}	
  	return sum;
  }	
 
 static int calue1(int...n1)
 {
  int sum1=0;	
  for(int i:n1)
   sum1+=i;
  return sum1; 	
 }	
}