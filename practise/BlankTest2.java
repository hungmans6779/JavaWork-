import java.util.*;
public class BlankTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("=========================");
  System.out.println("        �\����         ");
  System.out.println("=========================");
  System.out.println("1.����");
  System.out.println("2.��b");
  System.out.println("3.�l�B�d��");
  System.out.println("4.���}���t��");
  System.out.print("�п�J�z�n���\��:");
  int select=scan.nextInt();
  System.out.println("\n******************");
  switch(select)
  {
   case 1: System.out.println("�z����ܬO����");
           System.out.println("���¨ϥΥ��t��");
           break;
   case 2: System.out.println("�z����ܬO��b");
           System.out.println("���¨ϥΥ��β�");         	
           break;
   case 3: System.out.println("�z����ܬO�l�B�d��");
           System.out.println("���¨ϥΥ��β�");
           break;
   case 4: System.out.println("���¨ϥΥ��β�");
           break;
   default: System.out.println("�z���ﶵ���A���\���");
            System.out.println("���¨ϥΥ��β�");
            break;
  }	
 }
}