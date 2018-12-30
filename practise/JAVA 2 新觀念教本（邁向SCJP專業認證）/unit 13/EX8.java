import java.util.*;
public class EX8
{
 public static void main(String argv[])
 {
  Properties p=System.getProperties();
  String k[]={"os.name","java.vm.version","user.name","user.country","user.language"};
  for(int i=0;i<k.length;i++)
  {
   System.out.println(k[i]+"\t"+p.getProperty(k[i]));
  }
 }
}