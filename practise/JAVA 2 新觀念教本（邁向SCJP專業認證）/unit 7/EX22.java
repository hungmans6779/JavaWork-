public class EX22
{
 public static void main(String argv[])
 {
  Customer c[]=new Customer[3];
  c[0]=new Customer();
  c[1]=new Customer("��s�w");
  c[2]=new Customer("�i��",185,85);
  for(Customer k:c)
  {
   k.showAtt();
  }
 }
}

class Customer
{
 String name;
 int width;
 int height;
 public Customer(String name,int width,int height)
 {
  this.name=name;
  this.width=width;
  this.height=height;
 }
 public Customer(String name)
 {
  this(name,170,60);
 }
 public Customer()
 {
  this("�L�W��");
 }
 void showAtt()
 {
  System.out.println("�m�W : "+name+" ,���� : "+height+" ,�魫 : "+width); 
 }
}