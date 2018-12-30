import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class DateFormatTest4 extends Thread
{
 public static void main(String argv[])
 {
  new DateFormatTest4().start();
 }
 public void run()
 {
  DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.TAIWAN);
  while(true)
  {
   try
   {
   	sleep(1000);
    System.out.println(df.format(new Date()));
   }
   catch(InterruptedException ioe)
   {
   	
   }	
    
  }
 }
}