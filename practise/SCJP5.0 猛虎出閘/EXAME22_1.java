class Father
{
 private final void aMethod()
 {
  System.out.println("�ڬO�����O��aMethod ��k");
 }
}
public class EXAME22_1 extends  Father
{
 private final void aMethod()
 {
  System.out.println("�ڬO�ۤw��aMethod��k");
 }
 public static void main(String argv[])
 {
  EXAME22_1 e1=new EXAME22_1();
  e1.aMethod();
  
  /* �y���sĶ���~ 
  Father f1=new Father();
  f1.aMethod();  //aMethod()�Oprivate�ҥH����b�䥦�����O���Q�ϥ�
  */
  
  
  /*�y���sĶ���~
  Father e2=new EXAME22_1();
  e2.aMethod();
  */
 }
}