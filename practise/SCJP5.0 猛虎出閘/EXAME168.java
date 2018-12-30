import java.util.*;
public class EXAME168 implements Comparable
{
 public static void main(String argv[])
 {
  ArrayList<EXAME168>list=new ArrayList<EXAME168>();
  list.add(new EXAME168(2));
  list.add(new EXAME168(1));
  Collections.sort(list);
  System.out.println(list);
 }
 private int i;
 public EXAME168(int i){this.i = i;}
 public String toString(){ return Integer.toString(i); }
 public int compareTo(Object o)
 {
  EXAME168 i2=(EXAME168)o;
  return 0;
  //return i-i2.i;	
 }	
}