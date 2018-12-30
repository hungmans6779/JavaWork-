public class EX21
{
 public static void main(String argv[])
 {
  Pillar p[]={new Cylinder(5,20),new SquarePillar(10,20)};
  System.out.println("圓柱體的面積為 :"+p[0].getArea());
  System.out.println("圓柱體的面積為 :"+p[0].getVolum());
  System.out.println("方柱體的面積為 :"+p[1].getArea());
  System.out.println("方柱體的面積為 :"+p[1].getVolum());
  
 }
}

abstract class Pillar
{
 Pillar()
 {
 	System.out.println("看過來喔！抽象類別也可以建立建構子呀..............");
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