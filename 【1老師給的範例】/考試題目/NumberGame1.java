import java.util.*;
public class NumberGame1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  int endCountinue=0;
  System.out.println("****************************************************");	
 	System.out.println("程式名稱：猜數字遊戲第一題");
 	System.out.println("作    者：洪嘉宏(HUNG CHIA HUNG)");
 	System.out.println("上課導師：許大笨");
 	System.out.println("開發日期：2007年5月31日");
 	System.out.println("版權所有，請勿拷貝");
  System.out.println("****************************************************\n");	
  System.out.println("**********歡迎使用洪嘉宏的猜數字遊戲*********");
  do
  {
   System.out.print("\n請輸入數字範圍(100)以上-->");
   int input=kegin.nextInt();
   if(input<100)
   { input=100; }
   int randomValue=(int)(Math.random()*input);
   if(input<randomValue)
   {
    sureRandom(input);
   }	
   
   //System.out.println("randomValue="+randomValue);
   int runCount=0;
   
   if(input<=100)
      runCount=5;
   else if(input<=1000)
      runCount=10;
   else if(input<=10000)
      runCount=55;
   else if(input<=100000)
      runCount=505;
   else if(input<=1000000)
      runCount=5005;
   else if(input<=10000000)
      runCount=50005;
   else if(input<=100000000)
      runCount=500005;                               
   else
   {
   	  runCount=5000005;
   }	
   System.out.println("\n您共有"+runCount+"次機會\n");
   //開始執行猜數字遊	
   int inputValue=0; //遊戲過程中每次的輸入變數
   int guessCount=0; //記錄猜題的次數
   for(int i=1;i<=runCount;i++)
   {
   	System.out.print("第"+i+"次-->");
   	inputValue=kegin.nextInt();
   	if(inputValue>randomValue)
   	{
   	 if(i!=runCount)	
   	  System.out.println("低一點");
   	} 
   	else if(inputValue<randomValue)
   	{
   	 if(i!=runCount)	
   	  System.out.println("高一點");
   	} 
    else
    {
     guessCount=i+1;
     break;	
    }	
    guessCount=i;
   } 
   System.out.println();
   if(runCount!=guessCount)
   {
    if((guessCount-1)==1)
     System.out.println("您太優秀了！真是料事如神！");
    else if(guessCount<=(runCount/5)*2)
     System.out.println("嗯！不錯喔！可以去買個幸運樂透了...");
    else if(guessCount<=((runCount/5)*3))
     System.out.println("嗯！有點水準了...再努力看看喔！");
    else
    {
     System.out.println("再練習看看吧！成績一定會更好的...");
    }
   } 
   else 
   {
   	System.out.println("再接再厲,相信我,總有一天你會成功的");
   } 
   System.out.println("\n正確答案:"+randomValue);
   System.out.print("\n是否繼績遊戲:1.是 2.否--->");
   endCountinue=kegin.nextInt();
  }while(endCountinue!=2);
 }	
 public static int sureRandom(int input)
 {
 	int randomValue=0;
 	randomValue=(int)(Math.random()*input);
 	return randomValue;
 }		
}