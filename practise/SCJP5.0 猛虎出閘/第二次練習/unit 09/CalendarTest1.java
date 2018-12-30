import java.util.*;
public class CalendarTest1
{
 public static void main(String argv[])
 {
  Calendar now=Calendar.getInstance();
  System.out.println("(12):"+now);
  System.out.printf("(13):%tA %n",now);
  System.out.printf("(14):%tB %n",now);
  System.out.printf("(15):%tC¥@¬ö %n",now);
  System.out.printf("(16):%tc %n",now);
  System.out.printf("(17):%tD %n",now);
  System.out.printf("(18):%td %n",now);
  System.out.printf("(19):%te %n",now);
  System.out.printf("(20):Right now is %tr on %<tA,%<tB,%<te,%<tY. %n",now);
 }
}