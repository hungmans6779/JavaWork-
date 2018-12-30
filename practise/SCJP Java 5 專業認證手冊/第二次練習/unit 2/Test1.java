public class Test1
{
 public static void main(String argv[])
 {
  String value[]=go();
  for(String data:value)
   System.out.println(data);
 }
 public static String[] go()
 {
 	return new String[]{"a","b","c"};
 }	
 public int foo()
 {
 	char c='C';
 	return c;
 }	
 public int foo1()
 {
 	float f=2.5f;
 	return (int)f;
 }	
 public Object getObject()
 {
 	int []num={1,2,3};
 	return num;
 }	
}