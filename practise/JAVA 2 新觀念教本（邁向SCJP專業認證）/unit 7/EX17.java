class EX17
{
 public static void main(String argv[])
 {
 	testVar(9,6);
 	testVar(7);
 	testVar((byte)6);
 	testVar(2.5);
 	testVar('��');
 }	
 static void testVar(byte n)
 {
  System.out.println("�ǤJ�@��byte���O���Ѽ�");	
 }	
 static void  testVar(int n)
 {
  System.out.println("�ǤJ�@��int���O���Ѽ�");	
 }	
 static void testVar(double n)
 {
  System.out.println("�ǤJ�@��double���O���Ѽ�");	
 }	
 static void testVar(int ... n)
 {
 	System.out.println("�ǤJ���int���O�Ѽ�");
 }	
}	