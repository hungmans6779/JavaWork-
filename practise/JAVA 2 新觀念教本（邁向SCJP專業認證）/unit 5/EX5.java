class EX5
{
 public static void main(String argv[])
 {
 	String s[]={"超人","閃電俠","蜘蛛人","金剛狼"};
  if(argv.length<1)
  {
   System.out.println("請傳入您最喜愛的Xman:");
   System.out.println("(0)超人 (1)閃電俠 (2)蜘蛛人 (3)金剛狼");
   System.exit(0);
  }
  int ch=Integer.parseInt(argv[0]);
  if(ch<0 || ch>=s.length)
  {
   System.out.println("您的選擇超出範圍！，請重新選擇");
   System.exit(0);
  }
  System.out.println("您選擇的是 : "+s[ch]);
 }
}