public class EX10
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("請輸入您的年齡");
   return;	
  }	
  int age=Integer.parseInt(argv[0]);
  if(age>=18)
  {
   System.out.println("歡迎光迎");
   return;	
  }	
  else if(age>0)
  {
   System.out.println("未成年請勿進入");	
   return;
  }	
  assert false;
 }
}