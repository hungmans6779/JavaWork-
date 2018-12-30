class VarargTest1
{
 public static void main(String argv[])
 {
  VarargTest1 t1=new VarargTest1();
  int value[]={1,2,3,4,5,6,7,8,9,10};
  System.out.println(t1.calc1(value));
  System.out.println(t1.calc2(1,2,3,4,5,6,7,8,9,10));
 }
 int calc1(int num[])
 {
  int sum=0;
  for(int i=0;i<num.length;i++)
  {
   sum+=num[i];
  }
  return sum;
 }
 int calc2(int ... num)
 {
 	int sum=0;
 	for(int i:num)
 	{
 	 sum+=i;	
 	}	
 	return sum;
 }	
}