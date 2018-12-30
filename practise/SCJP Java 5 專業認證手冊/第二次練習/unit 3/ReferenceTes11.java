import java.awt.*;
public class ReferenceTes11
{
 public static void main(String argv[])
 {
  Dimension d=new Dimension(5,10);
  ReferenceTes11 rt=new ReferenceTes11();
  System.out.println("Before modify d.height="+d.height);
  rt.modify(d);
  System.out.println("After modify d.height="+d.height);
 }
 public void modify(Dimension dim)
 {
 	dim=new Dimension(10,20);
  dim.height=dim.height+1;
  System.out.println("Dim height="+dim.height);	
 }	

}