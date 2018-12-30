 /* 程式設計者：洪嘉宏                              *
  * 撰寫日期  ：95年06月01日                        *
  * 功能說明  ：此程式是為了瞭解Interface 及其Extends的應用方式 */ 
  
  
  
public class Index
{
 public static void main(String argv[])
 {
   Author.showAuthor();
   MultiFunctionalTank mft=new   MultiFunctionalTank();
   CobraHelicopter ch=new CobraHelicopter();
   
   //以下為多功能坦克車的移動及攻擊方式......
   System.out.println("\n以下為多功能坦克車的移動及攻擊方式......");
   System.out.println("===============================");
   mft.move();
   mft.shoot();
   mft.ShootingMachineGun();
   mft.LaunchTheSmog();
   
   //以下為眼鏡蛇直昇機的移動及攻擊方式......
   System.out.println("\n以下為眼鏡蛇直昇機的移動及攻擊方式......");
   System.out.println("===============================");
   ch.move();
   ch.shoot();
   ch.ShootingMachineGun();
   ch.PressForTheTearsCoalGas();
   ch.SearchAndRescuePeople();
 }
}