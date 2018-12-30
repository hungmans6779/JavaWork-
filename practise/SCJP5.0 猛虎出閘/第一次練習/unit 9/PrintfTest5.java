import java.util.Calendar;
public class PrintfTest5
{
 public static void main(String argv[])
 {
  Calendar now=Calendar.getInstance();
  System.out.println("(1) : "+now);
  System.out.printf("(2) : %tA %n",now);
  System.out.printf("(3) : %tB %n",now);
  System.out.printf("(4) : %tC 世紀 %n",now);
  System.out.printf("(5) : %tc %n",now);
  System.out.printf("(6) : %tD %n",now);
  System.out.printf("(7) : %td %n",now);
  System.out.printf("(8) : %te %n",now);
  System.out.printf("(9) : 現在的時間是%tr ==>"+"%<tA,%<tB,%<te,%<tY. %n",now); 
 }
}