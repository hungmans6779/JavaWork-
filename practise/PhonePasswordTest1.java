import java.util.*;
public class PhonePasswordTest1
{
 public static void main(String argv[])
 {
 	Scanner s=new Scanner(System.in);
  System.out.print("�п�J������K�X===>");
  int phonePassword=s.nextInt();
  System.out.print("�п�J�����SIM�d�K�X===>");
  int simPassword=s.nextInt();
  if(phonePassword==123) //�p�G����K�X���T
  {
   if(simPassword==456) //�p�GSIM�d�K�X���T
   {
   	System.out.println("����K�X��SIM�d�K�X���T�I�I�I");
   	System.out.println("�w��z�ϥΥ����....");
   }
   else
   {
   	System.out.println("SIM�d�K�X���~�I�I�I");
   }			
  }
  else //����K�X���~�A�A�P�_SIM�d�O�_���~
  {
   if((simPassword==456) && (phonePassword==123))
   {
   	System.out.println("����K�X��SIM�d�K�X���T�I�I�I");
   	System.out.println("�w��z�ϥΥ����....");
   }
   else if(simPassword==456)
   {
   	System.out.println("����K�X���~�I�I�I");
   }	
   else //SIM�d�K�X���~
   {
   	System.out.println("����K�X���~�I�I�I");
    System.out.println("SIM�d�K�X���~�I�I�I");
   }		
  }		
 }
}