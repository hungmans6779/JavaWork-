import java.util.Scanner;
public class SwitchTest1
{
 public static void main(String argv[])
 {
 	Scanner kegin=new Scanner(System.in);
  System.out.print("�п�J���~�O===>");
  int year=kegin.nextInt();
  System.out.print("�п�J���===>");
  int month=kegin.nextInt();
  System.out.println("============================");
  switch(month)
  {
   //���P�_31�Ѫ����	
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
            System.out.println(year+"�~"+month+"��O31��");
            break;
   //�P�_30�Ѫ����            
   case 4:
   case 6:
   case 9:
   case 11:
         	  System.out.println(year+"�~"+month+"��O31��");
            break;
   case 2:
          if(year%4==0)
          {
           if(((year%4==0)||(year%400==0))&&(year%100!=0))	
           	System.out.println("���~�O:"+year+"�~"+month+"��O28��"); //�Ӧ~�O��~
           else
           	System.out.println("���~�O:"+year+"�~"+month+"��O29��"); //�Ӧ~���O��~
          }
          else
           System.out.println("���~�O:"+year+"�~"+month+"��O29��");	//�Ӧ~���O��~
          break;
   default: 
          System.out.println("�z��J���Ȥ��A1-12����d��... ");
          break;
  }	
 }
}