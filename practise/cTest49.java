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
   case 1: 	data="�P����"; break;
   case 2:  data="�P���@"; break;
   case 3:  data="�P���G"; break;
   case 4:  data="�P���T"; break;
   case 5:  data="�P���|"; break;
   case 6:  data="�P����"; break;
   case 7:  data="�P����"; break;
   default: assert false; break;
  }	
  System.out.println("���׬O : "+data);
 }
}