import java.util.*;
public class cTest23
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�@�Ӽƭ�");
  String data=scan.next();
  if(!data.matches("[A-Z][1-9]{9}"))
  {
   System.out.println("��J�榡���~");	
  }	
  else
  {
   System.out.println("���T");	
  }	
  
 }
}