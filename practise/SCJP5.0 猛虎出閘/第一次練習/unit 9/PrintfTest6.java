import java.util.Calendar;
public class PrintfTest6
{
 public static void main(String argv[])
 {
  Calendar now=Calendar.getInstance();
  System.out.format("(1) : "+now);
  System.out.format("(2) : %tA %n",now);
  System.out.format("(3) : %tB %n",now);
  System.out.format("(4) : %tC 世紀 %n",now);
  System.out.format("(5) : %tc %n",now);
  System.out.format("(6) : %tD %n",now);
  System.out.format("(7) : %td %n",now);
  System.out.format("(8) : %te %n",now);
  System.out.format("(9) : 現在的時間是%tr ==>"+"%<tA,%<tB,%<te,%<tY. %n",now); 
 }
}