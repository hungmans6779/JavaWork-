public class EX4
{
 public static void main(String argv[])
 {
  IE e=new IE(){};
  IF f=new IF(){};
  System.out.println(e.i);
  System.out.println(e.k);
  //System.out.println(f.i);
  System.out.println(f.k);
 }
}

interface IA{}
interface IB
{
 int i=1;
}
interface IC
{
 int i=2;
}
interface ID
{
 int k=3;
}
interface IE extends IA,IB,ID{}
interface IF extends IA,IB,IC,ID{}