public class ExceptionTest2_1
{
 public static void main(String argv[]) 
 {
 	amethod();
 }
 static void amethod()
 {
  bmethod();
 }
 static void bmethod()
 {
 	cmethod();
 }
 static void cmethod()
 {
 	throw new ArithmeticException();
 }
}