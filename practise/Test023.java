import java.util.*;
public class Test023
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("�п�J�@�ӼƦr===>");
  int input=kegin.nextInt();
  if(input>=0)
  {
   if(input%2==0)
    System.out.println("�O����");
   else
    System.out.println("�O�_��");
  }
  else
   System.out.println("�t�ȨS���_����");	
 }
}