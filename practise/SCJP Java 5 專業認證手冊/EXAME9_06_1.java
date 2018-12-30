public class EXAME9_06_1
{
 public static void main(String argv[])
 {
  printAll(argv);
 }
 public static void printAll(String[] line)
 {
  for(int i=0;i<line.length;i++)
  {
   System.out.println(line[i]);
   try
   {
    Thread.currentThread().sleep(1000);	
   }
   catch(InterruptedException ie)
   {
    System.out.println(ie.getMessage());
    System.out.println(ie.getLocalizedMessage());	
   }	 
  }		
 }	
}