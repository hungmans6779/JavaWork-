class Mineral{}
class Gem extends Mineral{}
public class EXAME5_15
{
 static int x=7;
 static String s=null;
 public static void getWeight(Mineral m)
 {
  int y=0/x;
  System.out.print(s+" ");	
 }
 public static void main(String argv[])
 {
  Mineral ma[]={new Mineral(),new Gem()};
  for(Object o:ma)
  {
   getWeight((Mineral)o);	
  }	
 }
}