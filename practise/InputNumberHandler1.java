import java.util.*;
public class InputNumberHandler1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("�п�J�@�Ӽƭ�===>");
  int input=kegin.nextInt();
  if(input>=0)
  {
   if(input>0)
    System.out.println("�z��J���O����");
   else
    System.out.println("�z��J���O0");
  }
  else
  {
   System.out.println("�z��J���O�t��");
  }
 }
}