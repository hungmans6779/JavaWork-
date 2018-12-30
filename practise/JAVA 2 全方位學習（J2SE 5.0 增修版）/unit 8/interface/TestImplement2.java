public class TestImplement2
{
 public static void main(String argv[])
 {
  Weapon tank=new Tank();
  Weapon fighterPlane=new FighterPlane();
  
  System.out.print("坦克車攻擊的方式為 ");
  tank.shoot();
  
  System.out.print("戰鬥機攻擊的方式為 ");
  fighterPlane.shoot();
 }
}