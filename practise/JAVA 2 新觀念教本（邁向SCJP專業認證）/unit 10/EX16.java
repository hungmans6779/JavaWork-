import java.util.Formatter;
public class EX16
{
 public static void main(String argv[])
 {
  char c[]={'T','I','G','E','R'};
  int i[]={2,-3,5,-7,11};
  double d[]={0.1,1.5,2.7,3.3,4.9};
  Formatter f=new Formatter();
  for(int k=0;k<c.length;k++)
  {
   f.format(
    "%-3c %1$3d %2$+5d %2$#10x %3$7.2f\n",
    (int)c[k],i[k],d[k]);
  }
  System.out.print(f.toString());
 }
}