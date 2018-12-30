public class ReturnTest1_3
{
 public Object getArray()
 {
 	int num[]={1,2,3,4,5};
  return num;
 }
 public static void main(String argv[])
 {
 	ReturnTest1_3 r3=new ReturnTest1_3();
 	Object o=r3.getArray();
  System.out.print(o);
 } 
}