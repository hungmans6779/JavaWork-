import java.util.*;
public class SortedSetTest5
{
 public static void main(String argv[])
 {
  TreeSet ts1=new TreeSet();
  ts1.add("SCJP");
  ts1.add("SCMAD");
  ts1.add("SCWCD");
  ts1.add("SCBCD");
  ts1.add("1");
  ts1.add("2");
  ts1.add(new String("java"));
  ts1.add("MCSE");
  ts1.add("3");
  ts1.add("MCSD");
  ts1.add("NCCE");
  //TreeSet���X���O�O�L�k�P�ɥ[�J���P���A�����...........
  //ts1.add(new Integer(1));
  
 
  for(Object o:ts1)
  {
   String data=(String)o;	
   System.out.print(data+"\t");
  }	
 }
}