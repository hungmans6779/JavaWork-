import java.util.*;
public class Caluartor
{
 public static void main(String argv[])
 {
 	Scanner kegin=new Scanner(System.in);
 	while(true)
 	{
 	 System.out.println("****************************************************");	
 	 System.out.println("程式名稱：萬年曆系統");
 	 System.out.println("作    者：HUNG CHIA HUNG");
 	 System.out.println("上課導師：許   大   笨");
 	 System.out.println("開發日期：2007年5月30日");
 	 System.out.println("版權所有，請勿拷貝");
   System.out.println("****************************************************");	
 	 System.out.println("年份範圍值是(1980年之後的年份)");
   System.out.print("請輸入年份:");
   int year=kegin.nextInt();
  if(year<1980)
  {
   System.out.println();
   System.out.print("請重新輸入年份(1980年之後的年份):");
   year=kegin.nextInt();
  }	
   System.out.print("請輸入月份:");
   int month=kegin.nextInt();
   System.out.println();
   System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※");	
   System.out.println("\n\t中華民國("+(year-1911)+"年)，西元"+year+" 年 "+month+" 月");
   System.out.println("\n星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
   System.out.println();
   int yearCount=1980; //計算從1980年開始跑程式碼
   int monthCount=1;  //從1980年1月開始跑程式碼
   int colSpace=0;
   int daysTotal=0;  //計算出1980年後到要查詢的總天數
   while(yearCount<=year)
   {
   	if(monthCount==13) //判斷該月已經到12月份了.. 年份就加1
    {
     yearCount++; //累增一年
     monthCount=1; //	
    }	 
    if(yearCount<=year && monthCount==month) //計算出到要列印的月份經過的總天數
    {
      for(int i=1;i<=(yearCount==year?month:12);i++) //抓出從1月跑到12月份的年月份空格
      daysTotal+=daysCount(i,yearCount); 
    }
    if(yearCount==year	&& monthCount==month) //顯示當月的月曆表
    {	
     int nowMonthDays=daysCount(month,year);
     daysTotal=daysTotal-nowMonthDays;
     colSpace=(daysTotal+2)%7;	
     for(int i=1;i<=colSpace;i++)
      System.out.print("\t");
    
     int colCount=0;     
     for(int i=1;i<=nowMonthDays;i++)
     {
      if(i<=(7-colSpace))
      {
       System.out.print(i+"\t");	
      }		
      else
      {
       if(colCount==7)
       {
       	System.out.println();
        colCount=0;	
       }
       colCount++;
       System.out.print(i+"\t");		
      }
      if(i==(7-colSpace))
     	 System.out.println();	
     }
     System.out.println("\n****************************************************\n\n\n\n\n\n");
    }
    monthCount++; 
   }
   System.out.println();	
  } 
 }
 //判斷該月份的天數
 public static int daysCount(int monthTemp,int yearTemp)
 {
 	int days=0;
 	switch(monthTemp)
  {
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
         days=31;
         break;
   case 4:
   case 6:
   case 9:
   case 11:
         days=30;
         break;
   case 2:	
       if(yearTemp%4==0)
       {
       	if(yearTemp%400==0 || yearTemp%100!=0 && yearTemp%4==0)
         days=29;
        else
         days=28; 
       }
       else
       {
        days=28;	
       }	
   default:
       break;
  }	
  return days;
 }	
}