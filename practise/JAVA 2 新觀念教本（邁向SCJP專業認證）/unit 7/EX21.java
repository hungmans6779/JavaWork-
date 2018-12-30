public class EX21
{
 public static void main(String argv[])
 {
  new Box(6);
  new Box(5,4,3);
 }
}

class Box
{
 int width;
 int height;
 int thickness;
 Box(int n)
 {
  width=n;
  height=n;
  thickness=n;
  Box();
 }
 Box(int width,int height,int thickness)
 {
  this.width=width;
  this.height=height;
  this.thickness=thickness;
  Box();
 }
  void Box()
 {
  int i=width*height*thickness;
  System.out.println(this+" ªºÅé¿n¬°: "+i);
 }
}