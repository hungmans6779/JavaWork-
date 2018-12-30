public class EXAME153_2
{
 private static int counter=0;
 public static int getInstanceCount()
 {
  return counter;
 }
 public EXAME153_2()
 {
  counter++;
 }
 public static void main(String argv[])
 {
  EXAME153_2 e1=new EXAME153_2();
  EXAME153_2 e2=new EXAME153_2();
  EXAME153_2 e3=new EXAME153_2();
  System.out.println(EXAME153_2.getInstanceCount());
  System.out.println(getInstanceCount());
  
 }
}
