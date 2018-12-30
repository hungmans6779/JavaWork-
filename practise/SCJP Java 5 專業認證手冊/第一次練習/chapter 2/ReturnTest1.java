public class ReturnTest1
{
 public Object getObject()
 {
  return null;
 }
 
 public int[] getArray(int c[])
 {
 	//return c;
 	return new int[]{1,2,3};
 }	
 public static void main(String argv[])
 {
 	ReturnTest1 r=new ReturnTest1();
 	Object o=r.getObject();
 	System.out.println(o);
 	
 	int array[]={1,2,3,4,5};
 	int newArray[]=r.getArray(array);
 	for(int num:newArray)
 	{
 	 System.out.print(num+"\t");	
 	}	
 }	
}