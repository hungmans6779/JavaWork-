import java.util.*;
public class SwitchTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�z�����Z===>");
  int grade=scan.nextInt();
  int select=grade/10;
  String ch="";
  switch(select)
  {
   case 10:	
   case 9: ch="�ҵ�"; break;
   case 8: ch="�A��"; break;
   case 7: ch="����"; break;
   case 6: ch="�B��"; break;
   case 5: 
   case 4:
   case 3:
   case 2:
   case 1:
   case 0: ch="�z���ή�F"; break;
   default: ch="�z�����Z�ä��O�b0-100������"; break;
  }	
  System.out.println("�z�����Z:"+grade+"�O�ݩ�"+ch);
 }
}
