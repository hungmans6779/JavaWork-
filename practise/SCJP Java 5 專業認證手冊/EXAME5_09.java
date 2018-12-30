enum TimeZone{EST,CST,MST,PST}
public class EXAME5_09
{
 public static void main(String argv[])
 {
  String s="-";
  switch(TimeZone.CST)
  {
   case EST: s+="e";
   case CST: s+="c";
   case MST: s+="m";
   default : s+="X";
   case PST: s+="p";
  }
  System.out.println(s);
 }
}
