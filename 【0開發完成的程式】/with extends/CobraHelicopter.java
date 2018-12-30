public class CobraHelicopter extends Plane implements ShootingMachineGun,PressForTheTearsCoalGas,SearchAndRescuePeople
{
  public void shoot()
 {
  System.out.println("攻擊方式1為發射飛彈..... ");
 }
 public void ShootingMachineGun()
 {
  System.out.println("攻擊方式2為射擊機關槍..... ");
 }
 public void PressForTheTearsCoalGas()
 {
  System.out.println("攻擊方式3為發射催淚瓦斯..... ");
 }
 public void SearchAndRescuePeople()
 {
  System.out.println("特別任務為搜尋救人..... ");
 }
}