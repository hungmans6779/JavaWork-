import java.util.*;
public class SwitchTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("叫块眤Θ罿===>");
  int grade=scan.nextInt();
  int select=grade/10;
  String ch="";
  switch(select)
  {
   case 10:	
   case 9: ch="ヒ单"; break;
   case 8: ch="单"; break;
   case 7: ch="单"; break;
   case 6: ch="单"; break;
   case 5: 
   case 4:
   case 3:
   case 2:
   case 1:
   case 0: ch="眤ぃの"; break;
   default: ch="眤Θ罿ぃ琌0-100だぇず"; break;
  }	
  System.out.println("眤Θ罿:"+grade+"琌妮"+ch);
 }
}
