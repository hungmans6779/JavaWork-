public class EX2
{ 
 public static void main(String argv[])
 {
  �ǥ� a=new �ǥ�();
  System.out.println(a.�Ǹ�);
  System.out.println(a.�m�W);
  System.out.println(a.�ͤ�);
  a.showAtt();
 }
}

class �ӤH 
{
 String �m�W="���p��";
 String �ͤ�="1990-01-01";
 void showAtt()
 {
  System.out.println("�m�W : "+�m�W+",�ͤ� : "+�ͤ�);
 }
}

class �ǥ� extends �ӤH
{
 int �Ǹ�=9012345;
}