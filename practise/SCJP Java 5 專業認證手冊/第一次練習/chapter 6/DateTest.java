import java.util.*;
public class DateTest
{
 public static void main(String argv[])
 {
  Date d=new Date();
  String str=d.toString();
  System.out.println("�{�b���ɶ��� : "+str);
  
  Date now=new Date(System.currentTimeMillis());
  System.out.println("�{�b���ɶ��� : "+now);
 }
}