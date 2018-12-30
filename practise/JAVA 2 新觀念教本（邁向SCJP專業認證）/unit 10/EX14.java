public class EX14
{
 public static void main(String argv[])
 {
  StringBuffer sb=new StringBuffer("Java Cafe");
  Object obj=" ©@°Ø ";
  System.out.println(sb);
  sb.setCharAt(5,'K');
  System.out.println(sb);
  sb.reverse();
  System.out.println(sb);
  sb.reverse();
  sb.append(obj);
  sb.append(123);
  System.out.println(sb);
  sb.insert(0,"My ");
  System.out.println(sb);
  String sub="Kafe";
  int loc=sb.indexOf(sub);
  sb.delete(loc,loc+sub.length());
  System.out.println(sb);
 }
}