public class EXAME4_02_1
{
 public static void main(String argv[])
 {
  Short s=15;
  Boolean b;
  //b=(s instanceof Short); //�sĶ�ΰ��榨�\
  //b=(s instanceof Number);//�sĶ�ΰ��榨�\
  //b=(s instanceof String); //�sĶ����
  if(s instanceof String)
  {
   System.out.println("ok");
  }	
  else
  {
   System.out.println("error");	
  }	
  //System.out.println("b = "+b);
 }
}