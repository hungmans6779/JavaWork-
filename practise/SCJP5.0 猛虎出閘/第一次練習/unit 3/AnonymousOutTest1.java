interface Dog
{
 String name="Pet";
 void move();
 void skill();
}


public class AnonymousOutTest1
{
 public static void main(String argv[])
 {
  Dog d=new Dog()
  {
   public void move()
   {
    System.out.println("我會跑跑跳跳");
   }
   public void skill()
   {
    System.out.println("我會狩獵......");
   }
   public void sound()
   {
   	System.out.println("我的特殊才藝是唱歌..........");
   }	
  };
  System.out.println("我的名字叫 "+d.name);
  d.move();
  d.skill();
  ((AnonymousOutTest1$1)d).sound();
 }
}