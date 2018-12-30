public class ReturnTest1_1
{
 public int getInt()
 {
  char c='A';
  return c;
 }
 public int getInt1()
 {
 	float f=2.34f;
 	return (int)f;
 }	
 public static void main(String argv[])
 {
  ReturnTest1_1 r1=new ReturnTest1_1();
  System.out.println(r1.getInt());
  System.out.println(r1.getInt1());
 }
}