public class cTest58
{
 public static void main(String argv[])
 {
  System.out.println("���n�ȬO : "+kk(4));
 }
 
 public static  int kk(int value)
 {
  if(value==1)	
  {
   return 1;	
  }	
  else
  {
   return value*kk(value-1);
  }	
 }	
}