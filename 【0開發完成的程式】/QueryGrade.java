import java.util.*;
import java.text.*;
public class QueryGrade
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	int peopleCount=0; //peopleNum;
 	boolean showResult=false;
 	System.out.println("****************************************************");	
 	 System.out.println("�{���W�١G���Z��C�L�t��");
 	 System.out.println("�@    �̡GHUNG CHIA HUNG");
 	 System.out.println("�W�Ҿɮv�G�\   �j   ��");
 	 System.out.println("�}�o����G2007�~6��25��");
 	 System.out.println("���v�Ҧ��A�Фū���");
   System.out.println("****************************************************");	
 	System.out.print("\n�п�J�ǥͤH��===>");
   peopleCount=scan.nextInt(); 
  int [][]grade=new int[peopleCount][2];
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
   if((select>=2 && select<=6) && showResult)
   {
   	System.out.println("����������������������������������������������");
    System.out.println("�z���d�ߵ��G�p�U");
   }
   else if(select>1)
   {
   	System.out.println("������������������������������������������������������������������������");
   	System.out.println("��p�I�I�I�бz����J�Ҧ��ǥͪ����Z�A�~��ϥ�2-6���\�����..........");
   	System.out.println("�p��������D�A�Ц^�Ш�hungmans6779@yahoo.com.tw���H�c..bye");
   	System.out.println("������������������������������������������������������������������������");
   }	
   switch(select)
   {   	
    case 1: //���Z��J
     System.out.println("�z�ثe�Z�W�� "+peopleCount+" �Ӿǥ�");
     ll:
     for(int i=0;i<peopleCount;i++)
     {
     	System.out.print("�п�J�� "+(i+1)+" ��P�Ǫ����Z===>");
     	String temp=scan.next();
     	if((!temp.matches("\\d\\d")) && ( temp.length()==2))
     	{
     	 System.out.println("�z��J�����Z�榡���~�A�Э��s��J...");	
     	 i--;
     	 continue ll;
     	}	
     	else if((!temp.matches("\\d\\d\\d")) && ( temp.length()==3))
     	{
     	 System.out.println("�z��J�����Z�榡���~�A�Э��s��J...");	
     	 i--;
     	 continue ll;
     	}	
     	else if(temp.length()>=4) 
     	{
     	 System.out.println("�z��J�����Z�榡���~�ζW�X�d��ȡA�Э��s��J...");	
     	 i--;
     	 continue ll;	
     	}	
     	grade[i][0]=i+1;
      grade[i][1]=Integer.parseInt(temp); 
     	if(grade[i][1]<0 || grade[i][1]>100)
     	{
     	 System.out.println("??????????????????????????????????????????");	
     	 System.out.println("�z��J���Ȥ��b0-100�����d�򤺡I�I�I");
     	 System.out.println("�Э��s��J...");	
     	 System.out.println("??????????????????????????????????????????");
     	 i--;	
     	}	
     }	
     showResult=true;
     break;
    case 2: //���Z�C�L
     if(showResult)
     {
      for(int i=0;i<grade.length;i++)
       System.out.println("�� "+(i+1)+" ��P�Ǫ����Z�O "+grade[i][1]+"��");
     }  
     break;
    case 3: //�������Z
     if(showResult)
     {
      for(int i=0;i<grade.length;i++)
      {
       total+=grade[i][1];	
      } 
      NumberFormat nf=NumberFormat.getNumberInstance();
      nf.setMaximumFractionDigits(2);
      nf.setMinimumFractionDigits(2);
      String avg=nf.format(total/peopleCount);
      System.out.println("�Ҧ��ǥͪ��������Z�O: "+avg+" ��");
     } 
     break;
    case 4: //�̰���
     if(showResult)
     {
      int max=grade[0][1];
      for(int i=1;i<grade.length;i++)
      {
      	if(max<grade[i][1])
      	 max=grade[i][1];
      }	
      System.out.println("�̰��������Z�O: "+max+"��");
     } 
     break;
    case 5: //�̧C��
     if(showResult)
     {
      int min=grade[0][1];
      for(int i=1;i<grade.length;i++)
      {
       if(min>grade[i][1])
        min=grade[i][1];
      }	
      System.out.println("�̧C�������Z�O: "+min+"��");
     } 
     break;
    case 6: //���Z�Ƨ�
     if(showResult)
     {
     	int tempGrade=0;
     	int tempName=0;
     	System.out.println("���Z�W���Ѱ��ӧC�Ƨǵ��G�p�U");
      for(int i=0;i<grade.length-1;i++)
      {
       for(int j=i;j<grade.length;j++)
       {
       	//���Ӧ��Z���Ѱ��ӧC�Ƨ�
        if(grade[i][1]<grade[j][1])
        {
         //���Z�����
         tempGrade=grade[i][1];
         grade[i][1]=grade[j][1];
         grade[j][1]=tempGrade;
         //�m�W�����
         tempName=grade[i][0];
         grade[i][0]=grade[j][0];
         grade[j][0]=tempName;
        }		
       }		
      }
      for(int i=0;i<grade.length;i++)
       System.out.println("�� "+grade[i][0]+" ��P�Ǫ����Z�O:"+grade[i][1]+" ��");	
     } 	  
      break;
    case 7: //���}
     System.exit(0);
     break;
    default:
     System.out.println("�z����ܤ��b���\���椤�A�Э��s��J...");
     break;   	
   }	
   if((select>=2 && select<=6) && showResult)
    System.out.println("����������������������������������������������");	
  } 
 }
}