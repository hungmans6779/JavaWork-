public class cTest47
{
 public static void main(String argv[])
 {
 	System.out.println(MyMath.plus(2L,3,4));
 	//System.out.println(MyMath.plus(2,3,5L));
 }		
}	

class MyMath
{
 private MyMath()
 {
 	
 }
 public static  int plus(long l,int... value)
 {
 	int total=0;
 	for(int i=0;i<value.length;i++)
 	{
 	 total+=value[i];	
 	}	
 	return total;
 }
 //¿ù»~¼gªk
 /*
 public static long plus(int ... va,long l)
 {
 	return l;
 }	
 */	
}	