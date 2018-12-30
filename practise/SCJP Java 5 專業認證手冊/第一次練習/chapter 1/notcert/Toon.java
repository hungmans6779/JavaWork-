class Toon extends Cloo
{
 public void kk()
 {
  System.out.println(doRooThings());	
 }		
 public static void main(String argv[])
 {
 	new Toon().kk();
  //Cloo c=new Cloo();
  //c.testCloo();
  //c.doRooThings();
  Toon t=new Toon();
  System.out.println(t.doRooThings());
 }
}