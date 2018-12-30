public class EXAME79
{
 String str11=null;	
 public static void main(String argv[])
 {
  //test(null); //NullPointerException °õ¦æ®É´Á¿ù»~
  test("null");
 }
 public static void test(String str)
 {
 	if(str==null | str.length()==0)
 	{
 	 System.out.println("String is empty");	
 	}	
 	else
 	{
 	 System.out.println("String is not empty");	
 	}	
 }	
}