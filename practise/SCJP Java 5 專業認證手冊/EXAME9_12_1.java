public class EXAME9_12_1
{
 private StringBuilder contents=new StringBuilder();
 public void log(String message)
 {
 	contents.append(System.currentTimeMillis());
 	contents.append(": ");
 	contents.append(Thread.currentThread().getName());
 	contents.append(message);
 	contents.append("\n");
 }
 public String getContents()
 {
  return contents.toString();	
 }	
 public static void main(String argv[])
 {
 	EXAME9_12_1 e1=new EXAME9_12_1();
  e1.log("test");
  System.out.print(e1.getContents());
 }
}