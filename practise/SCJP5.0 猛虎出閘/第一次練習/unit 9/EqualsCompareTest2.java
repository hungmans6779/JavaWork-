//Integer �u�|�bbyte���d��-128��127����Ƥ����|���ƨϥ�
//�]�N�Oheap�Ϫ���ƫ��V�P�@��............
//���Onew Integer()���ͪ�����O�L�k�ϥΨ��ƪ�..........
public class EqualsCompareTest2
{
 public static void main(String argv[])
 {
  Integer a1=Integer.valueOf(100);
  Integer a2=Integer.valueOf(100);
  Integer a3=100;
  Integer a4=100;
  
  System.out.println("Integer a1=Integer.valueOf(100);");
  System.out.println("Integer a2=Integer.valueOf(100);");
  System.out.println("Integer a3=100; ");
  System.out.println("Integer a4=100; ");
  System.out.println();
  System.out.println("�䵲�G�p�U�ҥ�:");
  System.out.println("========================================");
  System.out.println("a1 == a2 : "+(a1==a2));
  System.out.println("a1.equals(a2) = "+a1.equals(a2));
  System.out.println("a3 == a4 : "+(a3==a4));
  System.out.println("a3.equals(a4) = "+a3.equals(a4));
  System.out.println("a1 == a3 : "+(a1==a3));
  System.out.println("a1.equals(a3) = "+a1.equals(a3));
 }
}