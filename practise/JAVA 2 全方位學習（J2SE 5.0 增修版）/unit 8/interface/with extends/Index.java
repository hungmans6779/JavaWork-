 /* �{���]�p�̡G�x�ŧ�                              *
  * ���g���  �G95�~06��01��                        *
  * �\�໡��  �G���{���O���F�A��Interface �Ψ�Extends�����Τ覡 */ 
  
  
  
public class Index
{
 public static void main(String argv[])
 {
   Author.showAuthor();
   MultiFunctionalTank mft=new   MultiFunctionalTank();
   CobraHelicopter ch=new CobraHelicopter();
   
   //�H�U���h�\��Z�J�������ʤΧ����覡......
   System.out.println("\n�H�U���h�\��Z�J�������ʤΧ����覡......");
   System.out.println("===============================");
   mft.move();
   mft.shoot();
   mft.ShootingMachineGun();
   mft.LaunchTheSmog();
   
   //�H�U������D���@�������ʤΧ����覡......
   System.out.println("\n�H�U������D���@�������ʤΧ����覡......");
   System.out.println("===============================");
   ch.move();
   ch.shoot();
   ch.ShootingMachineGun();
   ch.PressForTheTearsCoalGas();
   ch.SearchAndRescuePeople();
 }
}