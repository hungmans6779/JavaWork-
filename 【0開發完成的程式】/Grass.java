import java.util.*;
public class Grass
{
 String []image={"◎","△","※","★","◇","☆","女","■","▲","㊣","＃","＆","◆","⊕"};
 Random rm=new Random();	
 int ok=0;
 Scanner scan=new Scanner(System.in);
 public static void main(String argv[])
 {
  new Grass();

 }
 public Grass()
 {
 	String str="";
 	System.out.println("==================================================================");
 	System.out.println("遊戲名稱：吉普賽人猜心術");
 	System.out.println("遊戲規則");
 	System.out.println("1.在您的心中先想一個1～99的數字");
 	System.out.println("2.將數字的十位數及個位數字相加（例：您所想的數字34，那就是3+4=7）");
 	System.out.println("3.將您所想的數字34-7=27，將27去看該27相對應的圖片，牢記...");
 	do
 	{
 	 showImage();
   System.out.println("按任一鍵.....(瞧！不可思議的事情發生了)");
   str=scan.next(); 
   System.out.println("您的圖形是不是下列的呢！！！");
   System.out.println("【   "+image[ok]+"   】");
   System.out.println("\n嘿嘿！是不是猜中您心中的數字了呀！");
   System.out.println("這個程式能夠猜中您的心思.....信不信由您！");
   System.out.print("請按任一鍵，繼續本遊戲吧...(按' n '鍵離開本程式)=====>");
   str=scan.next(); 
  }while(!str.equals("n")); 	
 }	
 public void showImage()
 {
 	ok=rm.nextInt(14);
 	System.out.println("\n==================================================================\n");
  for(int i=1;i<=99;i++)
  {
   if(i%9!=0)
   {	
    System.out.print(i+"=>"+image[rm.nextInt(14)]+"\t");
   }
   else
   {
   	System.out.print(i+"=>"+image[ok]+"\t");
   }
   if(i%5==0) 
   { 
    System.out.println();
   }	 
  }
  System.out.println("\n==================================================================\n");
 }	
 
}