public class EX20
{
 public static void main(String argv[])
 {
  Rectangle rect1=new Rectangle();
  System.out.println("rect1 的面積為 : "+rect1.getArea());
  Rectangle rect2=new Rectangle(3,4);
  System.out.println("rect2 的面積為 : "+rect2.getArea());
 }
}

class Rectangle
{
 int height;
 int width;	
 public Rectangle()
 {
 	height=1;
 	width=1;
 }	
 public Rectangle(int height,int width)
 {
 	this.height=height;
 	this.width=width;
 }		
 public int getArea()
 {
 	return width*height;
 }		
}	