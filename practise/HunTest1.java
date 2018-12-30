public class HunTest1
{
 int count=0;
 public static void main(String argv[])
 {
  new HunTest1().hun(3,"A","B","C"); 
 }
 public void hun(int n,String a,String b,String c)
 {
  if(n==1)
  {
   System.out.println("第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
  } 
  else
  {
   hun(n-1,a,c,b);
   System.out.println("第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
   hun(n-1,b,a,c);	
  }	
 }	
}