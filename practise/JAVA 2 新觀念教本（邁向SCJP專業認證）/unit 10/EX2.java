import static java.lang.System.out;
public class EX2
{
 public static void main(String argv[])
 {
  float f[]={18.5f,-100,Float.POSITIVE_INFINITY,Float.NEGATIVE_INFINITY,Float.NaN};
  for(int i=0;i<f.length;i++)
  {
   out.print(f[i]+" - ");
   int n=Float.floatToIntBits(f[i]);
   out.println(Integer.toHexString(n));
   //System.out.println("n = "+n);
   for(int j=31;j>=0;j--)
   {
   	out.print(n>>j & 1);
   }		
   out.println();
  }
 }
}