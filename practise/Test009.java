import java.util.Scanner;
public class Test009
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("�п�J�a�O����(cm)==>");
  double leng=kegin.nextDouble();
  System.out.print("�п�J�a�O�e��(cm)==>");
  double width=kegin.nextDouble();
  double area=leng*width;
  System.out.println("********************");
  System.out.println("�п�J�z�n���Ͽj����");
  System.out.println("1.�j�z��(30*30)");
  System.out.println("2.���ե�(25*20)");
  System.out.println("3.����(20*20)");
  System.out.println("4.�Ѯv���w�]��(20*25)");
  System.out.print("�п�ܱz�n���Ͽj����=>");
  int select=kegin.nextInt();
  int page=0;
  String type;
  switch(select)
  {
   case 1: page=30*30; type="�j�z��(30*30)"; break;	
   case 2: page=25*20; type="���ե�(25*20)"; break;
   case 3: page=20*20; type="����(20*20)"; break;
   case 4: page=20*25; type="�Ѯv���w�]��"; break;
   default: type="�z����ܦ��~"; page=0; break;
  }	
  int totalPage=(int)(area/page); //totalPage����`���n
  int needBox=totalPage/250; //needBox���n�c��
  if (totalPage%250!=0)
  { needBox++; }
  System.out.println("==============================================");
  System.out.println("�z���a�O���׬O:"+leng+"cm,�e�׬O�G"+width+"cm");
  System.out.println("�z�ҿ�ܪ��O�G"+type);
  System.out.println("���n�ӥ�250�J�a�j"+needBox+"�c");
 }
}