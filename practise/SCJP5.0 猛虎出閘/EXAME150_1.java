public class EXAME150_1
{
 public static void logIt(String ... msgs)
 {
  for(String str:msgs)
  {
   System.out.print(str+"\t");	
  }	
  System.out.println();
 }
 /* �N�ɭP�sĶ���ѡA�]���޼ƪ����A���ФF 
 public static vod logIt(String [] ss)
 {
 	System.out.println("�ڳQ�B���F");
 }	
 */
 public static void main(String argv[])
 {
  logIt("log message1");
  logIt("log message1","log message2");
  logIt("log message1","log message2","log message3");
  String [] s=new String[]{"RED","GREEN","BLUE","YELLOW"};
  logIt(s);
 }
}