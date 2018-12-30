import java.awt.Dimension;
public class ReferenceTest2_2
{
 public static void main(String argv[])
 {
  Dimension dim=new Dimension(5,10);
  System.out.println("Before dim.height="+dim.height);
  ReferenceTest2_2 r=new ReferenceTest2_2();
  r.getTest(dim);
  System.out.println("After dim.height="+dim.height);
 }
 void getTest(Dimension dim)
 {
  dim.height+=1;
  System.out.println("dim="+dim.height);
 }
}