import java.util.Arrays;
import static java.lang.System.out;
import static java.lang.System.arraycopy;
import static java.util.Arrays.*;
public class EX12
{
 public static void main(String argv[])
 {
  int a1[]={13,11,7,5,3,2};
  int a2[]=new int[a1.length];
  arraycopy(a1,0,a2,0,a1.length);
  sort(a2);
  //System.out.println(toString(a1));
  System.out.println(Arrays.toString(a1));
  System.out.println(Arrays.toString(a2));
 }
}