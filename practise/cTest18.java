import java.util.*;
public class cTest18
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	int peopleCount=0; //peopleNum;
 	System.out.println("****************************************************");	
 	 System.out.println("�{���W�١G���Z��C�L�t��");
 	 System.out.println("�@    �̡GHUNG CHIA HUNG");
 	 System.out.println("�W�Ҿɮv�G�\   �j   ��");
 	 System.out.println("�}�o����G2007�~6��25��");
 	 System.out.println("���v�Ҧ��A�Фū���");
   System.out.println("****************************************************");	
 	System.out.print("\n�п�J�ǥͤH��===>");
   peopleCount=scan.nextInt(); 
  int []grade=new int[peopleCount];
 	while(true)
 	{
 	 System.out.println("\n\n****************************************************");	
   System.out.println("�п�ܪA�ȶ���");
   System.out.println("1.���Z��J");
   System.out.println("2.���Z�C�L");
   System.out.println("3.�������Z");
   System.out.println("4.�̰���");
   System.out.println("5.�̧C��");
   System.out.println("6.���Z�Ƨ�");
   System.out.println("7.���}");
   System.out.println("****************************************************\n\n");	
   System.out.print("�п�J�z�n���ﶵ==>");
   int select=scan.nextInt();
   double total=0;  //�p�⦨�Z���`�X
   
   if(select>=2 && select<=6)
   {
   	System.out.println("����������������������������������������������");
    System.out.println("�z���d�ߵ��G�p�U");
    System.out.println("����������������������������������������������");	
   }
   
   switch(select)
   {   	
    case 1: //���Z��J
     System.out.println("�z�ثe�Z�W�� "+peopleCount+" �Ӿǥ�");
     for(int i=0;i<peopleCount;i++)
     {
     	System.out.print("�п�J�� "+(i+1)+" ��P�Ǫ����Z===>");
     	grade[i]=scan.nextInt();
     }	
     break;
    case 2: //���Z�C�L
      for(int i=0;i<grade.length;i++)
       System.out.println("�� "+(i+1)+" ��P�Ǫ����Z�O "+grade[i]+"��");
     break;
    case 3: //�������Z
     for(int data:grade)
      total+=data;	
     System.out.println("�Ҧ��ǥͪ��������Z�O:"+(total/peopleCount));
     break;
    case 4: //�̰���
     int max=grade[0];
     for(int i=1;i<grade.length;i++)
     {
     	if(max<grade[i])
     	 max=grade[i];
     }	
     System.out.println("�̰��������Z�O: "+max+"��");
     break;
    case 5: //�̧C��
     int min=grade[0];
     for(int i=1;i<grade.length;i++)
     {
      if(min>grade[i])
       min=grade[i];
     }	
     System.out.println("�̧C�������Z�O: "+min+"��");
     break;
    case 6: //���Z�Ƨ�
     Arrays.sort(grade);
     System.out.println("�Ƨǫ᪺���Z�p�U");
     for(int i=0;i<grade.length;i++)
     	  System.out.println(grade[i]+"��");
     break;
    case 7: //���}
     System.exit(0);
     break;
    default:
     System.out.println("�z����ܤ��b���\���椤�A�Э��s��J...");
     break;
       	
   }	
   
  } 
 }
}