public class TestImplement1
{
 public static void main(String argv[])
 {
  Tank tank=new Tank();
  FighterPlane fighterPlane=new FighterPlane();
  
  System.out.print("\n�Z�J�����ʪ��覡�� ");
  tank.move();
  System.out.print("�Z�J���������覡�� ");
  tank.shoot();
  
  System.out.print("\n�԰������ʪ��覡�� ");
  fighterPlane.move();
  System.out.print("�԰����������覡�� ");
  fighterPlane.shoot();
  
 // System.out.println(tank instanceof Weapon);
  //System.out.println(fighterPlane instanceof Weapon);
 }
}