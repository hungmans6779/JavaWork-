import java.util.Scanner;
public class Test30
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�@�Ӽƭ�===>");
  int value=scan.nextInt();
  System.out.println("�p�G�j��10�A�h�L�X�j��10�A�_�h�L�X�p��10...");
  String str=(value>9)?"��Ȥj��10":"��Ȥp��10";
  System.out.println("���G�O:"+str);
 }
}