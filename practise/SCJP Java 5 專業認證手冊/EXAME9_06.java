public class EXAME9_06
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
   Thread.currentThread().sleep(1000);	
  }		
 }	
}