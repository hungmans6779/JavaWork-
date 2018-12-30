import java.util.Arrays;
import static java.lang.System.out;
import static java.lang.System.arraycopy;
public class EX11
{
 public static void main(String argv[])
 {
  int a1[]={13,11,7,5,3,2};
  int a2[]=new int[a1.length];
  arraycopy(a1,0,a2,0,a1.length);
  Arrays.sort(a2);
  for(int i:a1)
  {
   out.print(i+"\t");
  }
  out.println();
  for(int i:a2)
  {
   out.print(i+"\t");
  }
 }
}