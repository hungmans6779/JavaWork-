import java.util.*;
public class BlankTest1
{
 public static void main(String argv[])
 {
  int errorCount=0; //errorCount�O�ΨӧP�_���~������...
  Scanner kegin=new Scanner(System.in);
  System.out.print("�п�J�z���K�X(8���)===>");
  int password=kegin.nextInt();
  //�K�X���w��12345678
  if(password==12345678)
  {
   System.out.println();
   System.out.println("*************************************");
   System.out.println("�w��z�i�J���t�ΡA�п�ܱz�n���\��...");	
   System.out.println("1.����");
   System.out.println("2.�l�B�d��");
   System.out.println("3.��b");
   System.out.println("4.�䥦�\��");
   System.out.println("5.���}...");
  }	
  else //�Ĥ@������
  {
   System.out.println("�z���K�X��J��1�����~�I�I�I");
   System.out.println("�z�٥i�H�A��J�G��...");
   System.out.println("====================================");
   System.out.print("�ЦA��J�@���K�X==>");
   password=kegin.nextInt();
   if(password==12345678)
   {
    System.out.println();
    System.out.println("*************************************");
    System.out.println("�w��z�i�J���t�ΡA�п�ܱz�n���\��...");	
    System.out.println("1.����");
    System.out.println("2.�l�B�d��");
    System.out.println("3.��b");
    System.out.println("4.�䥦�\��");
    System.out.println("5.���}...");
   }
   else //�ĤG������
   {
   	System.out.println("�z���K�X��J��2�����~�I�I�I");
    System.out.println("�z�٥i�H�A��J�@��...");
    System.out.println("====================================");
    System.out.print("�ЦA��J�@���K�X==>");
    password=kegin.nextInt();
    if(password==12345678)
    {
     System.out.println();
     System.out.println("*************************************");
     System.out.println("�w��z�i�J���t�ΡA�п�ܱz�n���\��...");	
     System.out.println("1.����");
     System.out.println("2.�l�B�d��");
     System.out.println("3.��b");
     System.out.println("4.�䥦�\��");
     System.out.println("5.���}...");
    }
    else //�ĤT������...
    {
    	System.out.println("�o���U�ȡA��p�z�s���J�F3���K�X���O���~��...");
    	System.out.println("�d�����ĤF...");
    	System.out.println("�z���d���n�Q�^���F...");
    }	 
   }	 
  }	
 }
}