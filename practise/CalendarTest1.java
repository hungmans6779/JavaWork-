import java.util.*;
import java.text.*;

public class CalendarTest1
{
 public static void main(String argv[])
 {
 	Calendar c=Calendar.getInstance();
 	DateFormat df=DateFormat.getDateInstance();
 	for(int i=1;i<=30;i++)
 	{
 	 //System.out.println(c.getTime());
 	 System.out.println(df.format(c.getTime())+"("+c.getFirstDayOfWeek()+")");
 	 c.add(Calendar.DATE,1);
 	}
 	 
 }		
}	