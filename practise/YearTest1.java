import java.util.Scanner;
public class YearTest1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  while(true)
  {
   System.out.println("================================");
   System.out.print("�п�J�z�ثe���~��===>");
   int year=kegin.nextInt();
   if(year%4==0)
   {
    if(((year%400==0)||(year%4==0))&&(year%100!=0)) //�P�_4��400�����ơA�����O100������
      System.out.println("�z��J���~���O"+year+"�~�A�Ӧ~�O��~...");
    else 
     System.out.println("�z��J���~���O"+year+"�~�A�Ӧ~���O��~...");
   }
   else //�����P�_�X���O��~�F...
    System.out.println("�z��J���~���O"+year+"�~�A�Ӧ~���O��~...");
  } 		
 }
}