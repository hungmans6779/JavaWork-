public class EX4
{
 public static void main(String argv[])
 {
  String t="\t";
  System.out.println("ньн╚\tCeil \tFloor \tRound");
  for(double d=5.0;d<=6.0;d+=0.1)
  {
   double c=Math.ceil(d);
   double f=Math.floor(d);
   long r=Math.round(d);
   String s=""+d;
   if(s.length()>5)
   {
    s=s.substring(0,5);
   }
   System.out.println(s+t+c+t+f+t+r);
  }
 }
}