import java.util.Scanner;
public class Test009
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("請輸入地板長度(cm)==>");
  double leng=kegin.nextDouble();
  System.out.print("請輸入地板寬度(cm)==>");
  double width=kegin.nextDouble();
  double area=leng*width;
  System.out.println("********************");
  System.out.println("請輸入您要的磁磚類型");
  System.out.println("1.大理石(30*30)");
  System.out.println("2.長白石(25*20)");
  System.out.println("3.櫻花戶(20*20)");
  System.out.println("4.老師的預設值(20*25)");
  System.out.print("請選擇您要的磁磚種類=>");
  int select=kegin.nextInt();
  int page=0;
  String type;
  switch(select)
  {
   case 1: page=30*30; type="大理石(30*30)"; break;	
   case 2: page=25*20; type="長白石(25*20)"; break;
   case 3: page=20*20; type="櫻花石(20*20)"; break;
   case 4: page=20*25; type="老師的預設值"; break;
   default: type="您的選擇有誤"; page=0; break;
  }	
  int totalPage=(int)(area/page); //totalPage表示總面積
  int needBox=totalPage/250; //needBox須要箱數
  if (totalPage%250!=0)
  { needBox++; }
  System.out.println("==============================================");
  System.out.println("您的地板長度是:"+leng+"cm,寬度是："+width+"cm");
  System.out.println("您所選擇的是："+type);
  System.out.println("須要耗用250入地磚"+needBox+"箱");
 }
}