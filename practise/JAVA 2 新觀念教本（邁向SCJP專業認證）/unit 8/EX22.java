public class EX22
{
 public static void main(String argv[])
 {
  Shape s[]={new Triangle(10,20),new Rectangle(10,20)};
  System.out.println("�T���Ϊ����n�� : "+s[0].getArea());
  System.out.println("�x�Ϊ����n�� : "+s[1].getArea());
 }
}

abstract class Shape
{
 abstract double getArea();
 Shape()
 {
  System.out.println("shape : "+this);
 }
}

class Triangle extends Shape
{
 double b;
 double h;
 Triangle(double b,double h)
 {
  this.b=b;
  this.h=h;
 }
 double getArea()
 {
  return (b*h)/2;
 }
}

class Rectangle extends Shape
{
 double w;
 double h;
 Rectangle(double w,double h)
 {
  this.w=w;
  this.h=h;
 }
 double getArea()
 {
  return w*h;
 }
}