public class EXAME153
{
 private int counter=0;
 public static int getInstanceCount()
 {
  return counter;
 }
 public EXAME153()
 {
  counter++;
 }
 public static void main(String argv[])
 {
  EXAME153 e1=new EXAME153();
  EXAME153 e2=new EXAME153();
  EXAME153 e3=new EXAME153();
  System.out.println(EXAME153.getInstanceCount());
 }
}
