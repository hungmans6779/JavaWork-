import java.util.*;
public class cTest29
{
 enum week {�P���@,�P���G,�P���T};
 public static void main(String argv[])
 {
  switch(week.valueOf("�P���@"))
  {
  	case �P���@:
  	 System.out.println("�U�l��s��");
  	 break;
  	case �P���G:
  	 System.out.println("�U�l��s��");
  	 break;
  }
  for(week w:week.values())
  {
   System.out.println(w);	
  }	
 } 	
}