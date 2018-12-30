class Alien
{
 String invade(short str) { return "a few"; }
 String invade(short ... str) { return "many"; }	
}	
public class EXAME3_03
{
 public static void main(String argv[])
 {
  System.out.println(new Alien().invade(7)); //int 型態為預設值
 }
}