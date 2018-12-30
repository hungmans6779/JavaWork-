public class EXAME1_11 extends Thread
{
 String name;
 public static void main(String argv[])
 {
  EXAME1_11 t1=new EXAME1_11("1");
  EXAME1_11 t2=new EXAME1_11("2");
  t1.run();
  t2.run();
 }
 public EXAME1_11(String name)
 {
  this.name=name;
 }
 public void run()
 {
  try
  {
   for(int i=0;i<3;i++)
   {
    sleep((int)(Math.random()*100));
    System.out.print(name);
   }
  }
  catch(Exception e)
  {}
 }

}