class Inner
{
 private int x;
 public void setX(int x){ this.x=x; }
 public int getX(){ return x; }
}

class Outer
{
 private Inner y;
 public void setY(Inner y) { this.y=y ; }
 public Inner getY() { return y; }
}

public class EXAME77
{	
 public static void main(String argv[])
 {
  Outer o=new Outer();
  Inner i=new Inner();
  int n=10;
  i.setX(n);
  o.setY(i);
  //n=100; //¿ù»~
  //i.setX(100);
  //o.getY().setX(100);
  // i=new Inner();i.setX(100); //¿ù»~
  //o.setY(i);i=new Inner();i.setX(100); //¿ù»~
  i=new Inner();i.setX(100);o.setY(i);
  System.out.println(o.getY().getX());
 }

}