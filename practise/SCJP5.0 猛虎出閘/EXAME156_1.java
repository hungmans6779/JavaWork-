abstract class Shape
{	
 int x;
 int y;
 public abstract void draw();
 public void setAnchor(int x,int y)
 {
  this.x=x;
  this.y=y;
 }
}

public class EXAME156_1 extends Shape
{
 public void draw()
 {
  System.out.println("�ڳQ���F");	
 }
 public static void main(String argv[])
 {
  Shape s1=new EXAME156_1();
  s1.setAnchor(10,10);
  s1.draw();
  
  /* ��H���O�����new ���ͪ���
  Shape s2=new Shape();
  s2.setAnchor(10,10);
  s2.draw();
  */
  
  /* ��H���O�����new ���ͪ���  
  EXAME156 s3=new Shape();
  s3.setAnchor(10,10);
  s3.draw();
  */
  
  /* ���~
  EXAME156_1 s4=new EXAME156_1();
  s4.Shape.setAnchor(10,10);
  s4.Shape.draw();
  */ 
 }
}