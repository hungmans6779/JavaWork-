import java.util.*;
public class SwitchTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入您的成績===>");
  int grade=scan.nextInt();
  int select=grade/10;
  String ch="";
  switch(select)
  {
   case 10:	
   case 9: ch="甲等"; break;
   case 8: ch="乙等"; break;
   case 7: ch="丙等"; break;
   case 6: ch="丁等"; break;
   case 5: 
   case 4:
   case 3:
   case 2:
   case 1:
   case 0: ch="您不及格了"; break;
   default: ch="您的成績並不是在0-100分之內"; break;
  }	
  System.out.println("您的成績:"+grade+"是屬於"+ch);
 }
}
