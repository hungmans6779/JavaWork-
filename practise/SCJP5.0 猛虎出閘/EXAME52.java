abstract class Shape
{
 private int x;
 private int y;
 public abstract void draw();
 public void setAnchor(int x,int y)
 {
  this.x=x;
  this.y=y;
 }
}

public abstract class EXAME52 extends Shape
{
 private int readius;
 /*
 public void draw()
 { System.out.println(readius);	 }
 */
 public void draw(){}
 public static void main(String argv[])
 { }
}