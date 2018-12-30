public class EXAME5_13_1
{
 final static int x2=7;
 final static int x4=8;
 public static void main(String argv[])
 {
  Integer x1=5;
  String s="a";
  if(x1<9) s+="b";
  switch(x1)
  {
   case 5:s+="c";
   case x2:s+="d";
   case x4: s+="e";	
  }	
  System.out.print(s);
 }
}