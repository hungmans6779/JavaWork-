import java.util.*;
public class Litter
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	System.out.print("�п�J�Ĥ@�Ӽƭ�:");
 	int a=scan.nextInt();
 	int a1=a;
 	System.out.print("�п�J�ĤG�Ӽƭ�:");
 	int b=scan.nextInt();
 	int b1=b;
 	//�D�X�̤j���]��
  while(b!=0)
  {
   int temp=a%b;
   a=b;
   b=temp;
  }	
  int litter=a*(a1/a)*(b1/a);
  System.out.println(a1+","+b1+"���̤p������:"+litter);
 }
}