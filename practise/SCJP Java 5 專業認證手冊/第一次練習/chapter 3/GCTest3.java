class Island
{
 Island i;
 public void finalize()
 {
 	System.out.println(this+"被回收了");
 }	
}
public class GCTest3
{
 public static void main(String argv[])
 {
  Island i1=new Island();
  Island i2=new Island();
  Island i3=new Island();
  i1.i=i2;
  i2.i=i3;
  i3.i=i2;
  i1=null;
  i2=null;
  i3=null;
  System.gc();
 }
}