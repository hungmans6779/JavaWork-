class EX17
{
 public static void main(String argv[])
 {
 	testVar(9,6);
 	testVar(7);
 	testVar((byte)6);
 	testVar(2.5);
 	testVar('い');
 }	
 static void testVar(byte n)
 {
  System.out.println("肚byte把计");	
 }	
 static void  testVar(int n)
 {
  System.out.println("肚int把计");	
 }	
 static void testVar(double n)
 {
  System.out.println("肚double把计");	
 }	
 static void testVar(int ... n)
 {
 	System.out.println("肚ㄢint把计");
 }	
}	