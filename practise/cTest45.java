public class cTest45
{
 public static void main(String argv[])
 {
 	int a=0;	
 	assert a!=0:errorMessage(a);
 	System.out.println(a*a);
 }		
 public static String errorMessage(int a)
 {
 	return "a ���Ȥ��൥�� "+String.valueOf(a);
 }	
}	