public class EX30
{
 enum YourColor
 {
  PINK,IVORY,ORANGE,WHITE,GOLDEN
 }
 public static void main(String argv[])
 {
  MyColor mc1=MyColor.GREEN;
  MyColor mc2=MyColor.GREEN;
  YourColor yc1=YourColor.IVORY;
  YourColor yc2=EX30.YourColor.WHITE;
  
  echo(yc2);
  echo("yc2.equals(\"WHITE\"):"+yc2.equals("WHITE"));
  
  echo("yc1==yc2: "+(yc1==yc2));
  echo("mc1==mc2: "+(mc1==mc2));
  
  echo("yc1.compareTo(yc2): "+yc1.compareTo(yc2));
  echo("mc1.compareTo(mc2): "+mc1.compareTo(mc2));
 
 }
 
 static void echo(Object str)
 {
  System.out.println(str);
 }
 
}

enum MyColor
{
 RED,GREEN,BLUE,YELLOW
}