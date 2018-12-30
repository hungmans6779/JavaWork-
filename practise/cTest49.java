import java.util.*;
import static java.util.Calendar.*;
public class cTest49
{
 public static void main(String argv[])
 {
  Calendar c=getInstance();
  c.add(DATE,51);
  String data="";
  switch(c.get(DAY_OF_WEEK))
  {
   case 1: 	data="星期日"; break;
   case 2:  data="星期一"; break;
   case 3:  data="星期二"; break;
   case 4:  data="星期三"; break;
   case 5:  data="星期四"; break;
   case 6:  data="星期五"; break;
   case 7:  data="星期六"; break;
   default: assert false; break;
  }	
  System.out.println("答案是 : "+data);
 }
}