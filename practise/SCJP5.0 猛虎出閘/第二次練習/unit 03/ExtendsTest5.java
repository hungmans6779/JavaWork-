class Father
{
 public int money=8000000;
 public void undertaking()
 {
  System.out.println("���˪��Ʒ~");
 }
}

class Son extends Father
{
 public int money;
 Son(int money)
 {
  setMoney(money);
 }
 public void setMoney(int money)
 {
  this.money=money;
 }
 public void undertaking()
 {
  System.out.println("��l���Ʒ~");
 }
 public void go()
 {
  undertaking();
  System.out.println("����: "+money);
  System.out.println("======================");
  super.undertaking();
  System.out.println("����: "+super.money);
 }
}

public class ExtendsTest5
{
 public static void main(String argv[])
 {
 	new Son(500000).go();
 }		
}