public class EX10
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("�п�J�z���~��");
   return;	
  }	
  int age=Integer.parseInt(argv[0]);
  if(age>=18)
  {
   System.out.println("�w�����");
   return;	
  }	
  else if(age>0)
  {
   System.out.println("�����~�ФŶi�J");	
   return;
  }	
  assert false;
 }
}