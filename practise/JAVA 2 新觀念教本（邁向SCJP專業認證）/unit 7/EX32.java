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
    System.out.println("粉紅色");
    break;
   case IVORY:
    System.out.println("象牙色");
    break;
   case ORANGE:
    System.out.println("橘色");
    break;
   case WHITE:
    System.out.println("白色");
    break;
   default:
    System.out.println("其它顏色");
    break; 	
  } 	 
 }
}