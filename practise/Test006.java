import java.util.Scanner;
public class Test006
{
 public static void main(String argv[])
 {
  Scanner keyin=new Scanner(System.in);
  System.out.print("�п�J�Ĥ@�ӼƦr�G");
  int a1=keyin.nextInt();
  System.out.print("�п�J�ĤG�ӼƦr�G");
  int a2=keyin.nextInt();
  System.out.println();
  System.out.println("�Ĥ@�ӼƦra1�O�G"+a1+",�ĤG�ӼƦra2�O�G"+a2);
  System.out.println("=========================");
  System.out.println("(a1+a2)="+(a1+a2));
  System.out.println("(a1-a2)="+(a1-a2));
  System.out.println("(a1*a2)="+(a1*a2));
  System.out.println("(a1/a2)="+(a1/a2));
 }
}