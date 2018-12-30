class Ball
{
 String name;
 String kind;
 String color;
 
 public Ball(String name,String kind,String color)
 {
  this.name=name;
  this.kind=kind;
  this.color=color;
 }
} 

public class EqualsTest2
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("JAVA","SCJP","COOL");
  Ball b2=new Ball("JAVA","SCJP","COOL");
  System.out.println("b1 == b2 : "+(b1==b2));
  System.out.println("b1.equals(b2) : "+b1.equals(b2));
 }
}