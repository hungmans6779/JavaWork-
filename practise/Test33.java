import java.util.*;
public class Test33
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�Ĥ@�Ӽ�:");
  int first=scan.nextInt();
  System.out.print("�п�J�ĤG�Ӽ�:");
  int second=scan.nextInt();
  //�Ĥ@�ؤ�k
  int temp=0;
  if(first<second)
  {
   for(int i=first;i<=second;i++)
   	temp+=i;
  }
  else
  {
   for(int i=second;i<=first;i++)
   	temp+=i;
  }
  System.out.println("�Ĥ@�ؤ�k���`�M�O:"+temp);		
  //�ĤG�ؤ�k
  temp=0;
  if(first<second)
  {
   for(int i=first;i<=second;i++)
   	temp+=i;
  }
  else
  {
   for(int i=first;i>=second;i--)
   	temp+=i;
  }
 System.out.println("�ĤG�ؤ�k���`�M�O:"+temp);		   
 //�ĤT�ؤ�k
 temp=0;
 for(int i=(first<second?first:second);i<=(first<second?second:first);i++)
 	temp+=i;	
  System.out.println("�ĤG�ؤ�k���`�M�O:"+temp);		 
 }
}