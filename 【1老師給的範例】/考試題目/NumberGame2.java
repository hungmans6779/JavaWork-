import java.util.*;
import java.io.*;
public class  NumberGame2
{
 public static void main(String argv[])
 {
 	 System.out.println("****************************************************");	
 	 System.out.println("程式名稱：猜數字遊戲第二題");
 	 System.out.println("作    者：洪嘉宏(HUNG CHIA HUNG)");
 	 System.out.println("上課導師：許大笨");
 	 System.out.println("開發日期：2007年5月31日");
 	 System.out.println("版權所有，請勿拷貝");
   System.out.println("****************************************************\n");	
  System.out.println("歡迎光臨洪嘉宏猜數字遊戲,遊戲中輸入之字串請以字元 0~9組成,若輸入0表示放棄\n");
  Scanner kegin=new Scanner(System.in);
  //int runCount=1;
  int inputValue=0;
  int endCount=0;
  do
  {
   int runCount=1;
   System.out.print("請輸入數字字串長度-->");
   int numberLength=kegin.nextInt();	
   int temp=0;
   LinkedHashSet <Integer>ts=new LinkedHashSet<Integer>();	
   do
   {
    temp=(int)(Math.random()*10);
    ts.add(temp);
   }while(ts.size()<numberLength);
   int []randomValue=new int[numberLength];
   int []inputValues=new int[numberLength];
   int countBit=0;
   for(int data:ts) //把產生的亂數值放入randomValue的陣列中
   {
    randomValue[countBit]=data;
    countBit++;
   }    
    //開始執行猜測數字的程式碼
   gameOver:
   do
   {	  
   	String inputData="";	
    /*
    System.out.println();
   	System.out.print("randomValue=");
    showRandom(randomValue);	
    */
    System.out.print("\n第"+runCount+"次輸入-->");	
    runCount++;
    try
    {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     inputData=br.readLine();
    }
    catch(IOException ioe) { }		
    if(inputData.length()!=numberLength)
    {
     System.out.println("輸入字數錯誤，請重新輸入...");	
    }	
    else
    {
     //把輸入的資料存入inputValues的陣列中	
     for(int i=0;i<inputData.length();i++)
     {
       inputValues[i]=Integer.parseInt(inputData.substring(i,i+1));
     }
     
     /* ===========================================================*/
     //判斷所輸入的數字有無重覆
     boolean showError=false;
     la1:
     for(int i=0;i<inputValues.length-1;i++)
     {
      for(int j=i+1;j<inputValues.length;j++)
      {
       if(inputValues[i]==inputValues[j])
       {
        showError=true;	
        System.out.println("\n輸入數字不可重複,請重新輸入");
        break la1;
       }		
      }		
     }
  	 /* ===========================================================*/	
     
     int okCount=0;
     int errorCount=0;
     
     for(int i=0;i<inputValues.length;i++)
     {
     	c1:
      for(int j=0;j<inputValues.length;j++)
      {
       if(randomValue[i]==inputValues[j])
       {
       	if(i==j) //表示位置正確 okCount+1;
       	{
         okCount++;	
         break c1;
        }
        else
        {
         errorCount++;
         break c1;	
        }	     
       }			
      }		
     }
     
     if(!showError)
     {
      System.out.println("\n本次檢測結果："+okCount+"A "+errorCount+"B");
     } 
     if(okCount==4)
     {
     	 System.out.println("恭禧您答對了...");
     	 runCount=1;
       break gameOver;
     }	 
    }	
    inputValue=Integer.parseInt(inputData);
    if(inputValue/10==0 && inputValue%10==0)
    {
     System.out.print("\n正確答案:");
     showRandom(randomValue);
     System.out.println();
    }	
   }while(inputValue/10!=0); 
   
  System.out.print("\n按1繼續,按2結束-->");
  endCount=kegin.nextInt();	
  }while(endCount==1);
 }
 //顯示陣列中的內容
 public static void showRandom(int[] randomValue)
 {
  for(int data:randomValue)
   System.out.print(data);	
 }	
}