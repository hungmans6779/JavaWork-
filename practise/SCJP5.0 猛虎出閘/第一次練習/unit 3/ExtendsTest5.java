class Father
{
 int money=80000;
 void undertaking()
 {
  System.out.println("���˪��Ʒ~");
 }
}
class Son extends Father
{
 private int money;
 public Son(int money)
 {
  setMoney(money);
 }
 private void setMoney(int money)
 {
  this.money=money;
 }
 void undertaking()
 {
  System.out.println("��l���Ʒ~");
 }
 void go()
 {
  System.out.println("��l����= "+money);
  undertaking();
  System.out.println("=======================");
  System.out.println("���˪���= "+super.money);
  super.undertaking();
 }
}
public class ExtendsTest5 
{
 public static void main(String argv[])
 {
  new Son(50000).go();	
 }	
}