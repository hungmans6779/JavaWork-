public class MultiFunctionalTank extends Car implements ShootingMachineGun,LaunchTheSmog
{
 public void shoot()
 {
  System.out.println("攻擊方式1為發射大砲..... ");
 }
 public void ShootingMachineGun()
 {
  System.out.println("攻擊方式2為射擊機關槍..... ");
 }
 public void LaunchTheSmog()
 {
  System.out.println("攻擊方式3為施放煙霧彈..... ");
 }
} 