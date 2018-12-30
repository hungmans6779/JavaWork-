class EX13
{
 public static void main(String argv[])
 {
  System.out.println("我在main");
  到台北();
  System.out.println("回到main");
 }
 static void 到台北()
 {
  System.out.println("我在台北");
  到台中();
  System.out.println("回到台北");	
 }	
 static void 到台中()
 {
  System.out.println("我在台中");
  到高雄();
  System.out.println("回到台中");	
 }	
 static void 到高雄()
 {
 	System.out.println("我在高雄");
 }	
}