import java.io.*;
public class Index
{
 static int max=0;
 static int count=0;
 static int truePrimeArray[];
 
 
 //程式進入點
 //**************************************************************
 public static void main(String argv[])
 { 
  Author.showAuthor();
  System.out.println("\n\n\n");
  int inputNumber[]=new int[2];
  do
  {
   try
   {
    System.out.print("請輸入你的第 "+(count+1)+" 個數字 = ");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    if(count==0)
    {
     inputNumber[0]=Integer.parseInt(br.readLine());
    }
    else
    {
     inputNumber[1]=Integer.parseInt(br.readLine());
    } 
    
    if(inputNumber[0]>inputNumber[1])
    { max=inputNumber[0]; }
    else
    { max=inputNumber[1]; }    
   count++;
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }  
  }while(count<2);
   
  PrimeFactor(max);  //尋找出質因數的程式
  Author.showAuthor();
  int commonFactor=1;
  System.out.println("=====================================================");
  System.out.print("您所輸入的數字 "+inputNumber[0]+" 和 "+inputNumber[1]);
  for(int commonCount=0;commonCount<truePrimeArray.length;commonCount++)
  {
   if((inputNumber[0]%truePrimeArray[commonCount]==0)&&(inputNumber[1]%truePrimeArray[commonCount]==0))
   {
    commonFactor*=truePrimeArray[commonCount];
    inputNumber[0]/=truePrimeArray[commonCount];
    inputNumber[1]/=truePrimeArray[commonCount];
    commonCount--;
   }
  }
  System.out.print("最大公因數為 ： "+commonFactor);  
  System.out.println("\n=====================================================");
 }
 //**************************************************************


 
 //尋找出質數的副程式
 //**************************************************************
 public static void PrimeFactor(int max)
 {
  //primeArray是用來暫時存放會產生的質因數，
  //其陣列大小是所輸入數的最大值.....
  int primeArray[]=new int[max]; 
  int primeCount=0;
  int integer1=0,integer2=0,integer3=0,integer4=0;
  int i=0;
  for (i=1;i<=max;i++)
  { 
   if (i<10)
   {
     int aa,bb=0;
     for (int k=2;k<=7;k+=2)
      {
       aa=i/k;
       bb=i%k;
       if (aa==1 && bb==0)
       {
        primeArray[primeCount]=i;
        primeCount++;
       }  
       if(k==2)
       {
        k--;
       }
      } 
   }  
   else
   {
    integer1=i%2;
    integer2=i%3;
    integer3=i%5;
    integer4=i%7;
    if (integer1!=0 && integer2!=0 && integer3!=0 && integer4!=0)
    {
     primeArray[primeCount]=i;
     primeCount++;
    } 
   }
  } 
   //產生truePrimeArray的陣列來存放輸入的最大數所有產生的質因數
  truePrimeArray=new int[primeCount];
  System.arraycopy(primeArray,0,truePrimeArray,0,primeCount);  
  //showTruePrimeArray();//顯示truePrimeArray陣列的內容值  
 } 
 //**************************************************************
 
 
 
 //顯示truePrimeArray陣列內容值的副程式
 //**************************************************************
 public static void showTruePrimeArray()
 {
  System.out.print("truePrimeArray[] = [");
  for(int kk=0;kk<=truePrimeArray.length-2;kk++)
  {
   System.out.print(truePrimeArray[kk]+",");
  }
  System.out.print(truePrimeArray[truePrimeArray.length-1]+"]");
  System.out.println("\n length = "+truePrimeArray.length);
 }
 //**************************************************************
}