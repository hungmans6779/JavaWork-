enum TimeZone{EST,CST,MST,PST}
public class EXAME5_09_1
{
 public static void main(String argv[])
 {
  String s="-";
  TimeZone t=TimeZone.CST;
  switch(t)
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
