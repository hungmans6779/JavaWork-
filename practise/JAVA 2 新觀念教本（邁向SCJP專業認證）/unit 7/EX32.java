public class EX32
{
 enum YourColor
 {
  PINK,IVORY,ORANGE,WHITE,GOLDEN
 }
 
 public static void main(String argv[])
 {
  YourColor yc=YourColor.IVORY;
  switch(yc)
  {
   case PINK:
    System.out.println("������");
    break;
   case IVORY:
    System.out.println("�H����");
    break;
   case ORANGE:
    System.out.println("���");
    break;
   case WHITE:
    System.out.println("�զ�");
    break;
   default:
    System.out.println("�䥦�C��");
    break; 	
  } 	 
 }
}