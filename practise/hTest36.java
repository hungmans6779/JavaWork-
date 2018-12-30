import java.util.*;
import java.text.*;
public class hTest36
{
 public static void main(String argv[])
 {
 	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年 MM月 dd日 a hh時 mm分 ss秒");
 	System.out.println(sdf.format(new Date()));
 }		
}	