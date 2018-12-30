import static java.lang.System.*;
import java.util.regex.*;
public class EX19
{
 public static void main(String argv[])
 {
  String input="";
  String pattern="^(1[0-2]|0?[1-9])[\\-\\\\/]"+
              "(3[01]|[12][0-9]|0?[1-9])$";
  if(argv.length>0)
   input=argv[0];
  else
  {
   out.println("�ХH�z���ͤ鬰�{���Ѽ�");	
   exit(0);
  }
  Pattern p=Pattern.compile(pattern);
  Matcher m=p.matcher(input);
  if(m.find())
  {
   String d[]=argv[0].split("[\\-\\\\/]");
   d[0]=d[0].replaceAll("^0", "");
   d[1]=d[1].replaceAll("^0", "");	
   out.printf("�z���ͤ鬰%s��%s��\n",d[0],d[1]);
  }	
 }
}