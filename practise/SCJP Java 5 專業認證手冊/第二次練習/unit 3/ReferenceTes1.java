import java.awt.*;
public class ReferenceTes1
{
 public static void main(String argv[])
 {
  Dimension d=new Dimension(5,10);
  ReferenceTes1 rt=new ReferenceTes1();
  System.out.println("Before modify d.height="+d.height);
  rt.modify(d);
  System.out.println("After modify d.height="+d.height);
 }
 public void modify(Dimension dim)
 {
  dim.height=dim.height+1;
  System.out.println("Dim height="+dim.height);	
 }	

}