public class EXAME9_05 extends Thread
{
 public static void main(String argv[])
 {
  EXAME9_05 t=new EXAME9_05();
  Thread x=new Thread(t);
  x.start();
 }
 public void run()
 {
  for(int i=0;i<3;++i)
  {
   System.out.print(i+"..");	
  }		
 }	
}