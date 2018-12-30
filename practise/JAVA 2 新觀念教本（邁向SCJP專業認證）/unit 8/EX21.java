public class EX21
{
 public static void main(String argv[])
 {
  Pillar p[]={new Cylinder(5,20),new SquarePillar(10,20)};
  System.out.println("��W�骺���n�� :"+p[0].getArea());
  System.out.println("��W�骺���n�� :"+p[0].getVolum());
  System.out.println("��W�骺���n�� :"+p[1].getArea());
  System.out.println("��W�骺���n�� :"+p[1].getVolum());
  
 }
}

abstract class Pillar
{
 Pillar()
 {
 	System.out.println("�ݹL�ӳ�I��H���O�]�i�H�إ߫غc�l�r..............");
 }	
 double h;
 abstract double getArea();
 double getVolum()
 {
  return getArea()*h;
 }
}

class Cylinder extends Pillar
{
 double pi=3.1415926;
 double r;
 Cylinder(double r,double h)
 {
  this.r=r;
  this.h=h;
 }
 double getArea()
 {
  return pi*r*r;
 }
}

class SquarePillar extends Pillar
{
 double w;
 SquarePillar(double w,double h)
 {
  this.w=w;
  this.h=h;
 }
 double getArea()
 {
  return w*w;
 }
}