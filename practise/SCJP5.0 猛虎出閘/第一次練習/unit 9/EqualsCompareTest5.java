//Integer �u�|�bbyte���d��-128��127����Ƥ����|���ƨϥ�
//�]�N�Oheap�Ϫ���ƫ��V�P�@��............
//���Onew Integer()���ͪ�����O�L�k�ϥΨ��ƪ�..........
public class EqualsCompareTest5
{
 public static void main(String argv[])
 {
  Integer a1=new Integer(127);
  Integer a2=new Integer(127);
  Integer a3=Integer.valueOf(127);
  Integer a4=Integer.valueOf(127);
  Integer a5=Integer.valueOf(128);
  Integer a6=Integer.valueOf(128);
  Integer a7=127;
  Integer a8=127;
  Integer a9=128;
  Integer a10=128;
  
  System.out.println("Integer a1=new Integer(127);");
  System.out.println("Integer a2=new Integer(127);");
  System.out.println("Integer a3=Integer.valueOf(127);");
  System.out.println("Integer a4=Integer.valueOf(127);");
  System.out.println("Integer a5=Integer.valueOf(128);");
  System.out.println("Integer a6=Integer.valueOf(128);");
  System.out.println("Integer a7=127;");
  System.out.println("Integer a8=127;");
  System.out.println("Integer a9=128;");
  System.out.println("Integer a10=128;");
  System.out.println();
  System.out.println("�䵲�G�p�U�ҥ�:");
  System.out.println("========================================");
  System.out.println("a1 == a2 : "+(a1==a2));
  System.out.println("a1.equals(a2) = "+a1.equals(a2));
  System.out.println("a3 == a4 : "+(a3==a4));
  System.out.println("a3.equals(a4) = "+a3.equals(a4));
  System.out.println("a5 == a6 : "+(a5==a6));
  System.out.println("a5.equals(a6) = "+a5.equals(a6));
  System.out.println("a7 == a8 : "+(a7==a8));
  System.out.println("a7.equals(a8) = "+a7.equals(a8));
  System.out.println("a9 == a10 : "+(a9==a10));
  System.out.println("a9.equals(a10) = "+a9.equals(a10));
   
 
 }
}