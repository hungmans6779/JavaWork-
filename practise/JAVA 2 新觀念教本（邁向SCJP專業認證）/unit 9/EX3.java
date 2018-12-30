public class EX3
{
 public static void main(String argv[])
 {
  Singable s[]={new MyCat(),new MyBird(),null};
  s[2]=new Singable()
  {
   public void sing()
   {
    System.out.println("�m�N�I�m�N�I");
   }
  };
  for(Singable a:s)
  {
   a.sing();
  }
 }
}

interface Singable
{
 void sing();
}

class MyCat implements Singable
{
 public void sing()
 {
  System.out.println("���p���p���p��");
 }
}
class MyBird implements Singable
{
 public void sing()
 {
  System.out.println("��I��I��I");
 }
}