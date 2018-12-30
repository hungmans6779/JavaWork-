public class TestImplement1
{
 public static void main(String argv[])
 {
  Tank tank=new Tank();
  FighterPlane fighterPlane=new FighterPlane();
  
  System.out.print("\n坦克車移動的方式為 ");
  tank.move();
  System.out.print("坦克車攻擊的方式為 ");
  tank.shoot();
  
  System.out.print("\n戰鬥機移動的方式為 ");
  fighterPlane.move();
  System.out.print("戰鬥機攻擊的方式為 ");
  fighterPlane.shoot();
  
 // System.out.println(tank instanceof Weapon);
  //System.out.println(fighterPlane instanceof Weapon);
 }
}