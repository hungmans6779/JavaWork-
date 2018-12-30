public class EXAME153_1
{
 private int counter=0;
 public int getInstanceCount()
 {
  return counter;
 }
 public EXAME153_1()
 {
  counter++;
 }
 public static void main(String argv[])
 {
  EXAME153_1 e1=new EXAME153_1();
  EXAME153_1 e2=new EXAME153_1();
  EXAME153_1 e3=new EXAME153_1();
  System.out.println(e3.getInstanceCount());
 }
}
