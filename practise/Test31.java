import java.util.*;
public class Test31
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�Ĥ@��a��:");
  int a=scan.nextInt();
  System.out.print("�п�J�ĤG��b�ȡG");
  int b=scan.nextInt();
  int sa=a;
  int sb=b;
  int temp;
  while(b!=0)
  {
   temp=a%b;
   a=b;
   b=temp;
  }
  System.out.println(sa+","+sb+"���̤p������:"+a);
 }
}