public class EX11
{
 public static void main(String argv[])
 {
  String s[]=new String[4];
  s[0]="java";
  s[1]=new String("java");
  s[2]="java";
  s[3]="JaVa";
  for(int i=1;i<s.length;i++)
  {
   System.out.print("s[0]==s["+i+"] -> "+(s[0]==s[i]));
   System.out.println("\ts[0].equals(s["+i+"]) -> "+(s[0].equals(s[i])));
  }
  System.out.println("s[1].equalsIgnoreCase(s[3]) -> "+(s[1].equalsIgnoreCase(s[3])));
 }
}